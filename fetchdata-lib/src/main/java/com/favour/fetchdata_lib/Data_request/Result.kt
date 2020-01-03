package com.favour.fetchdata_lib.Data_request

sealed class Result {

    class Bitmap @JvmOverloads constructor(
        val bitmap: android.graphics.Bitmap
    ) : Result()


}