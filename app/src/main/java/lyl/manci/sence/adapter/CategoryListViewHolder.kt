package lyl.manci.sence.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_item_category_selection.view.*
import lyl.manci.sence.R
import lyl.manci.sence.model.CategoryModel


/**       Code with ❤  ´• ل •`   ❤
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
▬     Created by Leyla Akmancı                ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬    ▬
▬     leyla.manci@gmail.com                           ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬     ▬
▬     02/08/2020 - 19:42        ▬
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
 */
class CategoryListViewHolder(container: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(container.context)
            .inflate(R.layout.adapter_item_category_selection, container, false)
    ) {
    fun bind(
        model: CategoryModel,
        position: Int,
        onItemClickListener: (cat: CategoryModel, position: Int) -> Unit
    ) {
        itemView.txtCategory.text = model.categoryName
        itemView.txtCategory.background =
            ContextCompat.getDrawable(itemView.context, model.categoryImage)
        this.arrangeTransView(model.isSelected)
        itemView.frameCategoryItem.setOnClickListener {
            model.isSelected = !model.isSelected
            onItemClickListener(model, position)
            this.arrangeTransView(model.isSelected)
        }
    }

    private fun arrangeTransView(
        isSelected: Boolean
    ) {
        if (isSelected) {
            itemView.viewTrans.visibility = View.VISIBLE
        } else {
            itemView.viewTrans.visibility = View.GONE
        }
    }
}