package com.favour.fetchdata_lib.Data_request

import com.favour.fetchdata_lib.setup.RequestCreator


abstract class RequestHandler {

    abstract fun load(requestCreator: RequestCreator, callback: Callback)

}