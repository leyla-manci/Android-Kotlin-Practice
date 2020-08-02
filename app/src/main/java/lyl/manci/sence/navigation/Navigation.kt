package lyl.manci.sence.navigation

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import lyl.manci.sence.R
import lyl.manci.sence.enums.NavigateType


/**       Code with ❤  ´• ل •`   ❤
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
▬     Created by Leyla Akmancı                ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬    ▬
▬     leyla.manci@gmail.com                           ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬     ▬
▬     02/08/2020 - 16:32        ▬
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
 */

infix fun Fragment.anyFragmentToAnotherFragment(fragmentId: NavigateType) {
    when (fragmentId) {
        NavigateType.SplashToDashBoard -> {
            findNavController().navigate(R.id.action_splashFragment_to_dashboardFragment)
        }
        NavigateType.SplashToLogin -> {
            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        }
        NavigateType.SplashToOnBoarding -> {
            findNavController().navigate(R.id.action_splashFragment_to_onboardingFragment)
        }
        NavigateType.OnBoardingToCategorySelection -> {

            findNavController().navigate(R.id.action_onboardingFragment_to_categorySelectionFragment)
        }
    }
}