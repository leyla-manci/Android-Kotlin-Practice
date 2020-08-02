package lyl.manci.sence.Mock

import lyl.manci.sence.R
import lyl.manci.sence.model.OnboardingPagerModel
import java.util.*


/**       Code with ❤  ´• ل •`   ❤
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
▬     Created by Leyla Akmancı                ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬    ▬
▬     leyla.manci@gmail.com                           ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬     ▬
▬     01/08/2020 - 17:53        ▬
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
 */
object MockList {
    var onBoardPageCount = 0

    fun getOnBoardPageList(): List<OnboardingPagerModel> {
        val model = OnboardingPagerModel(
            "Connect with people around the World",
            R.drawable.arabic,
            "Lorem impsum blablabla Lorem impsumem impsum blablabla Lorem impsum blablabla Lorem impsum blablabla Lorem impsum blablabla "
        )

        val list = ArrayList<OnboardingPagerModel>()
        list.add(model)
        list.add(model)
        list.add(model)
        list.add(model)
        onBoardPageCount = list.size
        return list
    }

}