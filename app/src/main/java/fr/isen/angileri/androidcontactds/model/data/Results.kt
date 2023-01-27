package com.example.example

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Results (

  @SerializedName("gender"     ) var gender     : String?     = null,
  @SerializedName("name"       ) var name       : Name?       = Name(),
  @SerializedName("location"   ) var location   : Location?   = Location(),
  @SerializedName("email"      ) var email      : String?     = null,
  @SerializedName("login"      ) var login      : Login?      = Login(),
  @SerializedName("dob"        ) var dob        : Dob?        = Dob(),
  @SerializedName("registered" ) var registered : Registered? = Registered(),
  @SerializedName("phone"      ) var phone      : String?     = null,
  @SerializedName("cell"       ) var cell       : String?     = null,
  @SerializedName("id"         ) var id         : Id?         = Id(),
  @SerializedName("picture"    ) var picture    : Picture?    = Picture(),
  @SerializedName("nat"        ) var nat        : String?     = null

) : Parcelable{
  fun getFirstName() : String {
    return name?.first ?:""
  }

  fun getLastName() : String {
    return name?.last ?:""
  }

  fun getAddress() : String {
    return location?.street?.number.toString() + " " + location?.street?.name + ", " + location?.city + ", "
  }

  fun getPicture() : String {
    return picture?.thumbnail ?:""
  }


}