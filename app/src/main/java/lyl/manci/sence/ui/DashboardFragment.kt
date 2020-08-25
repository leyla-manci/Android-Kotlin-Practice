package lyl.manci.sence.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import lyl.manci.sence.R


class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as MasterActivity).checkBottomNavBarState(View.VISIBLE)
    }
}