package lyl.manci.sence.ui

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_onboarding.*
import lyl.manci.sence.Mock.MockList
import lyl.manci.sence.R
import lyl.manci.sence.adapter.OnboardingPagerAdapter
import lyl.manci.sence.enums.NavigateType
import lyl.manci.sence.navigation.anyFragmentToAnotherFragment


class OnboardingFragment : Fragment(R.layout.fragment_onboarding) {
    private val onPageCallBack = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            arrangeButtonVisibility(position)

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vpOnBoardingPage.adapter = OnboardingPagerAdapter(MockList.getOnBoardPageList())
        TabLayoutMediator(into_tab_layout, vpOnBoardingPage)
        { tab, position ->

        }.attach()
        backButton.setOnClickListener {
            vpOnBoardingPage.currentItem--
            arrangeButtonVisibility(vpOnBoardingPage.currentItem)
        }
        nextOrFinishButton.setOnClickListener {
            if (vpOnBoardingPage.currentItem == (MockList.onBoardPageCount - 1)) {
                this anyFragmentToAnotherFragment NavigateType.OnBoardingToCategorySelection
            } else {
                vpOnBoardingPage.currentItem++
                arrangeButtonVisibility(vpOnBoardingPage.currentItem)
            }
        }

    }

    override fun onStart() {
        super.onStart()
        vpOnBoardingPage.registerOnPageChangeCallback(onPageCallBack)
    }

    override fun onStop() {
        super.onStop()
        vpOnBoardingPage.unregisterOnPageChangeCallback(onPageCallBack)
    }

    fun arrangeButtonVisibility(position: Int) {

        backButton.visibility = if (position == 0) {
            View.INVISIBLE
        } else {
            View.VISIBLE
        }
        if (position == (MockList.onBoardPageCount - 1)) {
            nextOrFinishButton.text = "LET'S BEGIN"
            nextOrFinishButton.setTextColor(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.colorXDarkkBack
                )
            )
        } else {
            nextOrFinishButton.text = "NEXT"
            nextOrFinishButton.setTextColor(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.colorDarkBlue
                )
            )
        }

    }

}