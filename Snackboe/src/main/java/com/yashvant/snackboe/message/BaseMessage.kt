package com.yashvant.snackboe.message

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AccessibilityManager
import java.util.concurrent.TimeUnit
abstract class BaseMessage {

    abstract val containsControls: Boolean
    open val backgroundColor: Color? = null
    open val displayTimeSeconds: Int? = 4

    internal fun getInfoBarTimeout(
        accessibilityManager: AccessibilityManager?
    ): Long {
        return displayTimeSeconds.takeUnless { it == null || it <= 0 }?.let {
            val originalMillis = TimeUnit.SECONDS.toMillis(it.toLong())
            accessibilityManager?.calculateRecommendedTimeoutMillis(
                originalTimeoutMillis = originalMillis,
                containsIcons = true,
                containsText = true,
                containsControls = containsControls
            ) ?: originalMillis
        } ?: Long.MAX_VALUE
    }
}