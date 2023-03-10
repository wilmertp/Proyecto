package com.wilmer.nuwelogin.core.ex

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import com.wilmer.nuwelogin.core.dialog.DialogFragmentLauncher

fun DialogFragment.show(launcher: DialogFragmentLauncher, activity: FragmentActivity) {
    launcher.show(this, activity)
}
