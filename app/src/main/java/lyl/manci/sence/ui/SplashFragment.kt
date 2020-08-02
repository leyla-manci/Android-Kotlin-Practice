package lyl.manci.sence.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import lyl.manci.sence.R
import lyl.manci.sence.util.extChangeActionBarVisibility


class SplashFragment : Fragment(R.layout.fragment_splash) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity() extChangeActionBarVisibility false
    }
}