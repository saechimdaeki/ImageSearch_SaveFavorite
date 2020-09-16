package springboot.image.junseong

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PhotoList(
    val id:String,
    val description:String?,
    val urls:PhotoUrls,
    val user:PhotoUser
):Parcelable {
    @Parcelize
    data class PhotoUrls(
        val raw:String,
        val full:String,
        val regular:String,
        val small:String,
        val thumb:String
    ):Parcelable
    @Parcelize
    data class PhotoUser(
        val name:String,
        val userName:String
    ):Parcelable
    {
        val attributionUrl get() = "https://unsplash.com/$userName?utm_source=ImageSearchApp&utm_medium=referral"
    }
}