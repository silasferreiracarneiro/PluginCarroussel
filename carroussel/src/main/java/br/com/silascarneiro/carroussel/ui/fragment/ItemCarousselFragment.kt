package br.com.silascarneiro.carroussel.ui.fragment

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import br.com.silascarneiro.carroussel.R
import br.com.silascarneiro.carroussel.domain.ModelCaroussel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

class ItemCarousselFragment : Fragment() {

    private lateinit var model: ModelCaroussel

    private lateinit var image: ImageView
    private lateinit var title: TextView
    private lateinit var loadImage: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_caroussel, container, false)
        bindProperties(view)
        bindModel()
        searchImageIntoGlide()
        return view
    }

    private fun bindProperties(view: View) {
        this.image = view.findViewById(R.id.img_carrousel)
        this.loadImage = view.findViewById(R.id.load_image)
    }

    private fun bindModel() {
        this.model = arguments?.getParcelable<ModelCaroussel>(MODEL_CAROUSSEL) as ModelCaroussel
    }

    private fun searchImageIntoGlide() {
        Glide.with(this)
            .load(model.pathImage)
            .addListener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    loadImage.visibility = View.GONE
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    loadImage.visibility = View.GONE
                    return false
                }

            }).centerCrop()
            .error(R.drawable.erro_search_image)
            .into(image)
    }

    companion object {
        @JvmStatic
        fun newInstance(model: ModelCaroussel) =
            ItemCarousselFragment().apply {
                arguments = Bundle().apply {
                    this.putParcelable(MODEL_CAROUSSEL, model)
                }
            }
    }
}

const val MODEL_CAROUSSEL = "MODEL_CAROUSSEL"