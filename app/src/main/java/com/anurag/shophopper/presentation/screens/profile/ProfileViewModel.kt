package com.anurag.shophopper.presentation.screens.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anurag.shophopper.core.util.Constants.IS_LOGGED_IN_KEY
import com.anurag.shophopper.core.util.Constants.USER_TOKEN_KEY
import com.anurag.shophopper.core.util.onResponse
import com.anurag.shophopper.domain.usecase.GetMyInfoUseCase
import com.anurag.shophopper.domain.usecase.RemoveFromDataStoreUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val getMyInfoUseCase: GetMyInfoUseCase,
    private val removeFromDataStoreUseCase: RemoveFromDataStoreUseCase
) : ViewModel() {
    private val _uiState = MutableStateFlow(ProfileScreenUIState())
    val uiState = _uiState.asStateFlow()

    init {
        getMyProfile()
    }

    private fun getMyProfile() {
        viewModelScope.launch(Dispatchers.IO) {
            getMyInfoUseCase()
                .onResponse(
                    onLoading = {
                        _uiState.update { it.copy(isLoading = false) }
                    },
                    onSuccess = { response ->
                        _uiState.update { it.copy(isLoading = false, me = response) }
                    },
                    onFailure = {}
                )
        }
    }

    fun logout() {
        viewModelScope.launch(Dispatchers.IO){
            removeFromDataStoreUseCase(key = IS_LOGGED_IN_KEY)
            removeFromDataStoreUseCase(key = USER_TOKEN_KEY)
        }
    }
}