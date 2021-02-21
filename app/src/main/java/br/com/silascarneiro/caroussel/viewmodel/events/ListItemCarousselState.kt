package br.com.silascarneiro.caroussel.viewmodel.events

import br.com.silascarneiro.caroussel.domain.ItemCaroussel

sealed class ListItemCarousselState {
    data class SucessCall(val list: List<ItemCaroussel>) : ListItemCarousselState()
    data class ErrorCall(val erroMsg: String) : ListItemCarousselState()
}
