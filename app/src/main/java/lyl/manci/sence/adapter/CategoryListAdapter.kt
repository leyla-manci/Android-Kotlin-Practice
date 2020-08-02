package lyl.manci.sence.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import lyl.manci.sence.model.CategoryModel


/**       Code with ❤  ´• ل •`   ❤
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
▬     Created by Leyla Akmancı                ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬    ▬
▬     leyla.manci@gmail.com                           ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬     ▬
▬     02/08/2020 - 19:55        ▬
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
 */
class CategoryListAdapter(private val categoryList: List<CategoryModel>) :
    RecyclerView.Adapter<CategoryListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryListViewHolder =
        CategoryListViewHolder(parent)


    override fun getItemCount(): Int = categoryList.size

    override fun onBindViewHolder(holder: CategoryListViewHolder, position: Int) {
        holder.bind(categoryList[position])
    }
}