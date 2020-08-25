package lyl.manci.sence.ui


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_master.*
import lyl.manci.sence.R


class MasterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_master)
        NavigationUI.setupWithNavController(
            bottomNavBar,
            findNavController(this, R.id.navHostFragment)
        )
        checkBottomNavBarState(View.GONE)

    }

    fun checkBottomNavBarState(visibility: Int) {
        bottomNavBar.visibility = visibility
    }
}