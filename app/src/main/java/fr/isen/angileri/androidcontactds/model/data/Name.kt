package com.example.example

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Name (

  @SerializedName("title" ) var title : String? = null,
  @SerializedName("first" ) var first : String? = null,
  @SerializedName("last"  ) var last  : String? = null

) : Parcelable {

}