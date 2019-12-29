package com.favour.fetchdata_lib.setup

import java.io.Closeable

interface SetupDetails : Closeable {
    fun cacheMaxSize(maxSize: Int)
    fun cacheSize(size: Int)
    //    fun downloadFinished(size: Long)
    override fun close() = Unit

}