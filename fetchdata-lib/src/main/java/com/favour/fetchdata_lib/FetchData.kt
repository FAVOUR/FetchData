package com.favour.fetchdata_lib

import android.content.Context
import androidx.lifecycle.LifecycleObserver
import com.favour.fetchdata_lib.setup.SetupDetails
import com.favour.fetchdata_lib.utils.LibraryLruCache
import com.favour.fetchdata_lib.utils.calculateMemoryCacheSize
import com.favour.fetchdata_lib.utils.checkNotNull

class FetchData(var context: Context) : LifecycleObserver {
// lateinit  var  context: Context

//  constructor()


    class Builder {

        var context: Context
        lateinit var setupDetails: SetupDetails

        lateinit var cache: LibraryLruCache

        /** Start building a new [FetchData] instance.  */

        constructor(context: Context) {
            checkNotNull(context, "context == null")
            this.context = context
        }


//        /** Register a [EventListener].  */
//

        fun includeSetupDetails(setupDetails: SetupDetails): Builder {
            checkNotNull(setupDetails, "setupDetails is null")
            this.setupDetails = setupDetails

            return this
        }


        fun build(): FetchData {
            val context = this.context

            if (cache == null) {
                cache = LibraryLruCache(calculateMemoryCacheSize())
            }

            return FetchData(context = context)
        }
    }

    fun load(path: String) {

//        RequestBuilder(bitmapConfig = )
    }

//    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
//    void cancelAll()
//    {
//    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
//    void pauseAll()
//    {

//    @OnLifecycleEvent(Lifecycle.Event.ON_START)
//    void resumeAll()
//    {
}