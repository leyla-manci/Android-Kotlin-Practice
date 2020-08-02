package lyl.manci.sence.util

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity


/**       Code with ❤  ´• ل •`   ❤
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
▬     Created by Leyla Akmancı                ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬    ▬
▬     leyla.manci@gmail.com                           ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬     ▬
▬     02/08/2020 - 15:55        ▬
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
 */
infix fun Activity.extChangeActionBarVisibility(isVisible: Boolean) {

    (this as AppCompatActivity).supportActionBar?.let {
        if (isVisible != it.isShowing) {
            if (!isVisible) {
                it.hide()
            } else {
                it.show()
            }
        }
    }
}