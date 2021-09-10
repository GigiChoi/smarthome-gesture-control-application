package com.example.sourcecode_choichihong

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    object Statified
    {
        var mContext: Context? = null
        fun getContext() : Context? {
            return Statified.mContext
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Statified.mContext = baseContext
        val rvGesture = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.rvGesture)
        val etInstruction = findViewById<EditText>(R.id.etInstruction)
        rvGesture?.visibility = View.INVISIBLE

        var gestureList = ArrayList<Gesture>()
        gestureList.add(Gesture("Turn on lights", "", "View"))
        gestureList.add(Gesture("Turn off lights", "", "View"))
        gestureList.add(Gesture("Turn on fan", "", "View"))
        gestureList.add(Gesture("Turn off fan", "", "View"))
        gestureList.add(Gesture("Increase fan speed", "", "View"))
        gestureList.add(Gesture("Decrease fan speed", "","View"))
        gestureList.add(Gesture("Set Thermostat to specified temperature", "", "View"))
        gestureList.add(Gesture("0", "", "View"))
        gestureList.add(Gesture("1", "", "View"))
        gestureList.add(Gesture("2", "", "View"))
        gestureList.add(Gesture("4", "", "View"))
        gestureList.add(Gesture("5", "", "View"))
        gestureList.add(Gesture("6", "", "View"))
        gestureList.add(Gesture("7", "", "View"))
        gestureList.add(Gesture("8", "", "View"))
        gestureList.add(Gesture("9", "", "View"))


        val adapter = GestureAdapter(gestureList)
        rvGesture?.adapter = adapter
        rvGesture?.layoutManager = LinearLayoutManager(this)

    }
}