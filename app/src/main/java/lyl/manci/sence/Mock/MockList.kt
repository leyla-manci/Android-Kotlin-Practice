package lyl.manci.sence.Mock

import lyl.manci.sence.R
import lyl.manci.sence.model.CategoryModel
import lyl.manci.sence.model.OnboardingPagerModel


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
            R.drawable.onboard_flovers,
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

    fun getCategoryList(): List<CategoryModel> {
        val model1 = CategoryModel(
            "TEKNOLOJİ",
            R.drawable.category_selection_background,
            false
        )

        val model2 = CategoryModel(
            "BİLİM",
            R.drawable.category_selection_background,
            false
        )
        val model3 = CategoryModel(
            "EĞİTİM",
            R.drawable.category_selection_background,
            false
        )
        val model4 = CategoryModel(
            "EKONOMİ - FİNANS",
            R.drawable.category_selection_background,
            false
        )
        val model5 = CategoryModel(
            "KÜLTÜR - SANAT",
            R.drawable.category_selection_background,
            false
        )
        val list1 = ArrayList<CategoryModel>()
        list1.add(model1)
        list1.add(model2)
        list1.add(model3)
        list1.add(model4)
        list1.add(model5)
        return list1
    }
}