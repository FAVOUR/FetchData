package com.favour.fetchdata_lib.Data_request

interface Callback {

    fun onSuccess(result: Result?)
    fun onError(t: Throwable)


}