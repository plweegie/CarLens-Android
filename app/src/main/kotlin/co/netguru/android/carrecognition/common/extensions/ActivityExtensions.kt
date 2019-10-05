package co.netguru.android.carrecognition.common.extensions

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.replaceFragment(@IdRes containerViewId: Int, fragment: Fragment, TAG: String) {
    supportFragmentManager
            .beginTransaction()
            .replace(containerViewId, fragment, TAG)
            .commit()
}