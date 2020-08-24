package lyl.manci.sence.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_category_selection.*
import lyl.manci.sence.Mock.MockList
import lyl.manci.sence.R
import lyl.manci.sence.adapter.CategoryListAdapter
import lyl.manci.sence.enums.NavigateType
import lyl.manci.sence.model.CategoryModel
import lyl.manci.sence.navigation.anyFragmentToAnotherFragment
import lyl.manci.sence.util.CommonObject.sharedPrefKey


class CategorySelectionFragment : Fragment(R.layout.fragment_category_selection) {
    private val selectedCategoryList: MutableList<CategoryModel> = mutableListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        selectedCategoryList.clear()
        this.checkContinueBtnState()
        rvCategorySelection.adapter =
            CategoryListAdapter(MockList.getCategoryList()) { model, position ->
                if (model.isSelected) {
                    selectedCategoryList.add(model)
                } else {
                    selectedCategoryList.remove(model)
                }
                this.checkContinueBtnState()
            }
        categorySelectionContinue.setOnClickListener {
            this anyFragmentToAnotherFragment NavigateType.CategorySelectionToLogin
        }

        val sharedPref = requireActivity().getPreferences(Context.MODE_PRIVATE)
        with(sharedPref.edit())
        {
            putBoolean(sharedPrefKey, true)
            commit()
        }

    }

    private fun checkContinueBtnState() {
        categorySelectionContinue.isEnabled = (selectedCategoryList.size >= 3)
    }
}
