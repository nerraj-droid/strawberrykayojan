package com.example.ucordilleras

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import com.example.ucordilleras.R
import com.example.ucordilleras.first


class splashscreen : Activity() {
    private var mProgress: ProgressBar? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        mProgress = findViewById<View>(R.id.splash_screen_progress_bar) as ProgressBar
        //Splash Screen duration
        Thread(Runnable {
            doWork()
            startApp()
            finish()
        }).start()
    }

    private fun doWork() {
        var progress = 0
        while (progress < 100) {
            try {
                Thread.sleep(1000)
                mProgress!!.progress = progress
            } catch (e: Exception) {
                e.printStackTrace()
            }
            progress += 10
        }
    }

    private fun startApp() {
        val intent = Intent(this@splashscreen, first::class.java)
        startActivity(intent)
    }
}

