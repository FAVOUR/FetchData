package com.favour.fetchdata_lib.Data_request

import com.favour.fetchdata_lib.setup.RequestCreator
import com.favour.fetchdata_lib.utils.checkNotNull
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class Network_Interactor : RequestHandler() {
    override fun load(requestCreator: RequestCreator, callback: Callback) {

        val request = createRequest(requestCreator)
        val req = OkHttpClient()

        req.newCall(request).enqueue(object : okhttp3.Callback {
            override fun onFailure(call: Call, e: IOException) {
                callback.onError(e)

            }

            override fun onResponse(call: Call, response: Response) {
//               callback.onSuccess(response.body)
            }
        })
    }

    fun createRequest(requestCreator: RequestCreator): Request {

        val uri = checkNotNull(requestCreator.uri, "Uri is empty")


        val _request = Request.Builder()
            .url(uri.toString())
            .build()

        return _request
    }


}

