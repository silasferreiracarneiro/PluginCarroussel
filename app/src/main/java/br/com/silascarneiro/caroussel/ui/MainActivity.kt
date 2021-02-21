package br.com.silascarneiro.caroussel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.silascarneiro.caroussel.R
import br.com.silascarneiro.carroussel.domain.ModelCaroussel
import br.com.silascarneiro.carroussel.ui.views.CarousselView

class MainActivity : AppCompatActivity() {

    private val caroussel by lazy { findViewById<CarousselView>(R.id.caroussel) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        caroussel.setListCaroussel(
            listOf(
                ModelCaroussel("Minuto Touro de Ouro (28/12) - Abertura do mercado com Pablo Spyer", "https://s2.glbimg.com/q750DuDl994_4uFANz4B_6qjwaM=/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_63b422c2caee4269b8b34177e8876b93/internal_photos/bs/2019/v/x/VGTevdRriAsNtmZpaXKg/foto28fin-301-invest-c14.jpg"),
                ModelCaroussel("Fundos da Truxt rendem até 43% em ano de crise; confira as principais apostas da gestora para 2021", "https://www.infomoney.com.br/wp-content/uploads/2020/12/covid-19-5205245_1920.jpg"),
                ModelCaroussel("Ant, do bilionário Jack Ma, começa a se tornar pesadelo para investidores globais; veja os cenários para a empresa", "https://www.infomoney.com.br/wp-content/uploads/2020/10/Ant-Group.jpg"),
                ModelCaroussel("5 ações para comprar no mesmo preço de uma passagem para Orlando", "https://storage.googleapis.com/wp-noticias/2020/12/4f6f22d9-low-cost-800x450-2.jpg"),
                ModelCaroussel("Caixa paga auxílio emergencial a 3,2 milhões nascidos em novembro", "https://www.infomoney.com.br/wp-content/uploads/2020/04/auxilio-emergencial.jpg"),
                ModelCaroussel("Ibovespa supera 118 mil pontos com bom humor no exterior", "https://storage.googleapis.com/wp-noticias/2020/12/8d83c78c-ibovespa.jpg"),
                ModelCaroussel("Pfizer adia entrega de doses da vacina a países da Europa por problema de logística", "https://www.infomoney.com.br/wp-content/uploads/2019/06/pfizer-bloomberg.jpg"))
        )
    }
}