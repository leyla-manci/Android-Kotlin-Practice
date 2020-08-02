package lyl.manci.sence.ui

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import lyl.manci.sence.R
import lyl.manci.sence.enums.NavigateType
import lyl.manci.sence.navigation.anyFragmentToAnotherFragment
import lyl.manci.sence.util.extChangeActionBarVisibility


class SplashFragment : Fragment(R.layout.fragment_splash) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity() extChangeActionBarVisibility false
        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                if (true) {
                    //ilk kez giriyor ise
                    this@SplashFragment anyFragmentToAnotherFragment NavigateType.SplashToOnBoarding
                } else {
                    if (false) {
                        //daha önce login olmuş veya loginsiz devam seçeneği seçilmiştir
                        this@SplashFragment anyFragmentToAnotherFragment NavigateType.SplashToDashBoard

                    } else {

                        this@SplashFragment anyFragmentToAnotherFragment NavigateType.SplashToLogin
                    }
                }
            }

            override fun onTick(millisUntilFinished: Long) {}


        }.start()


    }
}