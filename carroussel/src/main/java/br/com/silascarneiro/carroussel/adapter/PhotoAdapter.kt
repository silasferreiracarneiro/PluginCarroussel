package br.com.silascarneiro.carroussel.adapter

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import br.com.silascarneiro.carroussel.domain.ModelCaroussel
import br.com.silascarneiro.carroussel.ui.fragment.ItemCarousselFragment

class PhotoAdapter(
    fragmentManager: FragmentManager,
    private val list: List<ModelCaroussel>)
    : FragmentPagerAdapter(fragmentManager) {

    override fun getCount() = 10

    override fun getItem(position: Int): Fragment {
        return ItemCarousselFragment.newInstance(list[position % list.size])
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }
}