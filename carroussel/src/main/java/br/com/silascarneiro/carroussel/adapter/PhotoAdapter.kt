package br.com.silascarneiro.carroussel.adapter

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import br.com.silascarneiro.carroussel.domain.ModelCaroussel
import br.com.silascarneiro.carroussel.ui.fragment.ItemCarousselFragment

class PhotoAdapter(
    fragmentManager: FragmentManager,
    private val list: List<ModelCaroussel>)
    : FragmentPagerAdapter(fragmentManager) {

    override fun getCount() = list.size

    override fun getItem(position: Int) =
        ItemCarousselFragment.newInstance(list[position])
}