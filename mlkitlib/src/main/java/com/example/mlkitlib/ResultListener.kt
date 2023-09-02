package com.example.mlkitlib

import com.google.mlkit.vision.text.Text

interface ResultListener {
    fun onSuccess(text: String)
    fun onFailure(e: Exception)
}

class FaceActivityRunner
{
    fun static Start(activity: Activity, callback: ResultListener)
    {

    }
}

