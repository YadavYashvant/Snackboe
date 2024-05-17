package com.yashvant.snackboe

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.google.android.material.snackbar.Snackbar

object SnackbarHelper {
    @Composable
    fun SnackbarExample() {
        val context = LocalContext.current
        val snackbarVisibleState = remember { mutableStateOf(false) }

        /*Column {
            Button(onClick = {
                snackbarVisibleState.value = true
            }) {
                Text("Show Snackbar")
            }

            if (snackbarVisibleState.value) {
                Snackbar(
                    action = {
                        Button(onClick = {
                            snackbarVisibleState.value = false
                        }) {
                            Text("Dismiss")
                        }
                    },
                    modifier = androidx.compose.ui.Modifier.padding(16.dp)
                ) {
                    Text("This is a Snackbar!")
                }
            }
        }*/
    }
}
