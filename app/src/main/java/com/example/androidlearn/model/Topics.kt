package com.example.androidlearn.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Topics(
    val topicName: String,  val topicDetails: String, @DrawableRes val topicImage: Int):
    Parcelable



