package lyl.manci.sence.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_category_selection.*
import lyl.manci.sence.Mock.MockList
import lyl.manci.sence.R
import lyl.manci.sence.adapter.CategoryListAdapter


class CategorySelectionFragment : Fragment(R.layout.fragment_category_selection) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvCategorySelection.adapter = CategoryListAdapter(MockList.getCategoryList())

    }
}
