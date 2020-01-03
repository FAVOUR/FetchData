package com.favour.fetchdata_lib.Data_request

interface Callback {

    fun onSuccess(result: RequestHandler?)
    fun onError(t: Throwable)


}