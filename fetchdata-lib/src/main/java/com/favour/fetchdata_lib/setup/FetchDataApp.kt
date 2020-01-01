package com.favour.fetchdata_lib.setup

import com.favour.fetchdata_lib.FetchData

object FetchDataApp {

    private val instance: FetchData by lazy {
        val context = this.instance.context
        FetchData
            .Builder(context)
            .includeSetupDetails(SetupDetailsImplimenter())
            .build()
    }

    @JvmStatic
    fun get() = instance

}