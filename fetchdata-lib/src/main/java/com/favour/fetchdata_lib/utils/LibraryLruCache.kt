package com.favour.fetchdata_lib.utils

import android.graphics.Bitmap
import android.util.LruCache

class LibraryLruCache(val maxByteCount: Int) {

    /** Create a cache with a given maximum size in bytes.  */

    val cache =
        object : LruCache<String, BitMapAndSize>(if (maxByteCount != 0) maxByteCount else 1) {
            override fun sizeOf(key: String, value: BitMapAndSize): Int = value.size
        }

    operator fun get(key: String): Bitmap? = cache[key].bitmap


    //Surpose  to be a Private inner class
    class BitMapAndSize(val bitmap: Bitmap, val size: Int)

}