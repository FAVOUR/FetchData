package com.favour.fetchdata_lib.utils

//class Util {


fun <T> checkNotNull(value: T?, message: String?): T {
    if (value == null) {
        throw NullPointerException(message)
    }
    return value
}

/** Get max available VM memory, exceeding this amount will throw an
OutOfMemory exception*/
@Throws(OutOfMemoryError::class)
fun calculateMemoryCacheSize(): Int {


    val maxMemory = (Runtime.getRuntime().maxMemory() / 1024).toInt()

    // 1/8th of the available memory is used for this memory cache.
    val cacheSize = maxMemory / 8

    return cacheSize
}
//}