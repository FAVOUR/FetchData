package com.favour.fetchdata_lib.setup

class SetupDetailsImplimenter : SetupDetails {

    private var maxCacheSize = 0
    private var cacheSize = 0


    //Max cache size of the in-memory
    override fun cacheMaxSize(maxSize: Int) {
        maxCacheSize = maxSize
    }

    //Size of the information to be cache
    override fun cacheSize(size: Int) {
        cacheSize = size
    }

//    override fun downloadFinished(size: Long) {
//    }
//

}