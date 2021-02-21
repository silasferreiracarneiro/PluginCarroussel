package br.com.silascarneiro.carroussel.domain

import android.os.Parcel
import android.os.Parcelable

class ModelCaroussel(val title: String?, val pathImage: String?) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(pathImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelCaroussel> {
        override fun createFromParcel(parcel: Parcel): ModelCaroussel {
            return ModelCaroussel(parcel)
        }

        override fun newArray(size: Int): Array<ModelCaroussel?> {
            return arrayOfNulls(size)
        }
    }
}