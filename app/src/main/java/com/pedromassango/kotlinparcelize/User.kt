package com.pedromassango.kotlinparcelize

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by pedromassango on 1/7/18.
 */
@SuppressLint("ParcelCreator")
@Parcelize
class User(var username: String, var age: Int): Parcelable