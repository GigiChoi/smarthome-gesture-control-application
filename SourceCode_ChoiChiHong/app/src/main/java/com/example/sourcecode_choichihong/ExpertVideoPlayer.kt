package com.example.sourcecode_choichihong

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class ExpertVideoPlayer : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expert_video)

        var gestureName = intent.extras?.getString("gestureName")
        var gestureVideoPath = intent.extras?.getString("gestureVideoPath")

        val videoView = findViewById<VideoView>(R.id.videoView)
        val tvGestureVideoTitle = findViewById<TextView>(R.id.tvGestureVideoTitle)
        val buttonReplay = findViewById<Button>(R.id.buttonReplay)
        val buttonPractice = findViewById<Button>(R.id.buttonPractice)



    }
}