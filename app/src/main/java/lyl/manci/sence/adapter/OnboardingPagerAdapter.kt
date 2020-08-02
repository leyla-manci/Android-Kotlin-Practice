package lyl.manci.sence.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import lyl.manci.sence.model.OnboardingPagerModel


/**       Code with ❤  ´• ل •`   ❤
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
▬     Created by Leyla Akmancı                ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬    ▬
▬     leyla.manci@gmail.com                           ▬
▬     ▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬     ▬
▬     01/08/2020 - 16:26        ▬
▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬
 */
class OnboardingPagerAdapter(val onBoardList: List<OnboardingPagerModel>) :
    RecyclerView.Adapter<OnboardingPagerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingPagerViewHolder =
        OnboardingPagerViewHolder(parent)


    override fun getItemCount(): Int = onBoardList.size

    override fun onBindViewHolder(holder: OnboardingPagerViewHolder, position: Int) {
        holder.bind(onBoardList[position])
    }
}