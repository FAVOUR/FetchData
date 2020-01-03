package com.favour.fetchdata_lib.setup

import android.net.Uri
import androidx.annotation.Nullable
import com.favour.fetchdata_lib.FetchData

class RequestCreator(var fetchData: FetchData, @Nullable var uri: Uri, var resourceId: Int)