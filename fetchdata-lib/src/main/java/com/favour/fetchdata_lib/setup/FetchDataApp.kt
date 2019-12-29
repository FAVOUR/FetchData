package com.favour.fetchdata_lib.setup

import android.content.Context
import com.favour.fetchdata_lib.FetchData

object FetchDataApp {

    private val instance: FetchData by lazy {
        var context = this.instance.context
        FetchData
            .Builder()
            .includeSetupDetails(SetupDetailsImplimenter())
            .build()
    }

    @JvmStatic
    fun get(context: Context) = instance

}