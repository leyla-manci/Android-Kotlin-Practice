package lyl.manci.sence.ui


import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import lyl.manci.sence.R


class MasterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master)

        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                //     supportFragmentManager.beginTransaction().replace(R.id.frameLayoutMain,OnboardingFragment()).commit()
            }

            override fun onTick(millisUntilFinished: Long) {

            }


        }.start()
    }
}