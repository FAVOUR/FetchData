package com.favour.fetchdata_lib.setup

import android.graphics.Bitmap
import android.net.Uri


/**This class inherits the parameters contained by the users class the builder class*/
abstract class RequestBuilder {


//    class Builder {

    var uri: Uri? = null
    var resourceId = 0
    var config: Bitmap.Config? = null

    constructor(
        uri: Uri?,
        resourceId: Int,
        bitmapConfig: Bitmap.Config?
    ) {
        this.uri = uri
        this.resourceId = resourceId
        config = bitmapConfig
    }

//    }

}


