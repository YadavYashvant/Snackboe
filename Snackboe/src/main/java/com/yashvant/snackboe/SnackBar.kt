package com.yashvant.snackboe

import android.content.Context
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

    fun SnackBoer(context: Context, message: String, mode: String = "success"){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }