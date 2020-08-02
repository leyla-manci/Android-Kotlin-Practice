# Android-Kotlin-Practice
Sence

show&hide actionbar

infix fun Activity.extChangeActionBarVisibility(isVisible: Boolean) {

    (this as AppCompatActivity).supportActionBar?.let {
        if (isVisible != it.isShowing) {
            if (!isVisible) {
                it.hide()
            } else {
                it.show()
            }
        }
    }}


-use this extension funciton where you want as below:

 requireActivity() extChangeActionBarVisibility false
 
