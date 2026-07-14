package com.anurag.shophopper.core.util

import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.anurag.shophopper.domain.model.Category

object Constants {

    //App Constants
    const val TAG = "3wiida"
    const val APP_DATA_STORE_NAME = "SHOP_HOPPER_DATA_STORE"
    const val IMAGE_URL = "https://omnicart.onrender.com/images/"

    //Data Store Keys
    val IS_LOGGED_IN_KEY = booleanPreferencesKey("IS_LOGGED_IN_KEY")
    val USER_TOKEN_KEY = stringPreferencesKey("USER_TOKEN_KEY")

    //Runtime Util Constants
    var isLoggedIn = false
    var userToken = ""
    var categories: List<Category> = emptyList()

}