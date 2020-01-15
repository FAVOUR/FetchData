package com.favour.fetchdata_lib.utils

import android.annotation.SuppressLint
import android.graphics.Bitmap
import androidx.annotation.RequiresApi
import okio.Buffer
import okio.ForwardingSource
import okio.Source
import java.io.IOException

class BitMapUtils {

    @Throws(IOException::class)
    fun decodeStream(source: Source): Bitmap {

        var writre: Writer = Writer(source)

    }


    private class Writer(source: Source) : ForwardingSource(source) {
        var thrownException: IOException? = null

        @Throws(IOException::class)
        override fun read(sink: Buffer, byteCount: Long): Long {

            try {
                return super.read(sink, byteCount)

            } catch (e: IOException) {
                thrownException = e
                throw e
            }
        }
    }


    companion object {

        @RequiresApi(28)
        @SuppressLint("Override")
        private fun decodeStreamP(): Bitmap {

        }

        private decodeStreamPreP():Bitmap
        {
            val isWebPFile =

            val bitmap: Bitmap?
        }

    }
}