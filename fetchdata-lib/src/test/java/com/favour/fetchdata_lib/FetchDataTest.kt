package com.favour.fetchdata_lib

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import junit.framework.TestCase.assertEquals
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FetchDataTest {

    @Test
    fun build_methodCalled_returnContext() {
        val goal = ApplicationProvider.getApplicationContext<Context>()

//        Log.d("Context : InstrumentationRegistry.getInstrumentation().targetContext",)
//        var fetchDat = FetchData.Builder(goal)

        //Hamcrest
        assertThat(goal, IsEqual(goal))

        //Junit
        assertEquals(goal, InstrumentationRegistry.getInstrumentation().targetContext)
        assertEquals(
            goal, InstrumentationRegistry.getInstrumentation().context
        )

    }



}