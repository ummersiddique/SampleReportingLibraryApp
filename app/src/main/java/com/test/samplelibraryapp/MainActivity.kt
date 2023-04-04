package com.test.samplelibraryapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.test.fusionsamplelibrary.FusionUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FusionUtils.starBugReporting(context = this)
    }
}