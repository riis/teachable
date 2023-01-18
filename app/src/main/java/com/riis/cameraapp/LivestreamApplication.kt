package com.riis.cameraapp

import android.app.Application
import android.content.Context
import com.secneo.sdk.Helper

class LivestreamApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        Helper.install(this)
    }
}