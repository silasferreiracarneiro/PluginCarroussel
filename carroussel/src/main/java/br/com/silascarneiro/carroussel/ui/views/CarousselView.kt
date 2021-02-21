package br.com.silascarneiro.carroussel.ui.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import br.com.silascarneiro.carroussel.R
import br.com.silascarneiro.carroussel.adapter.PhotoAdapter
import br.com.silascarneiro.carroussel.domain.ModelCaroussel

class CarousselView(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    private var lista: List<ModelCaroussel> = listOf()

    private val pager by lazy { findViewById<ViewPager>(R.id.pager_photos) }

    private val adapter by lazy { PhotoAdapter((context as FragmentActivity).supportFragmentManager, lista) }

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.view_caroussel_photo, this, true)
        init(view)
    }

    private fun init(view: View) {
        
    }

    fun setListCaroussel(lista: List<ModelCaroussel>) {
        this.lista = lista
        pager.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}