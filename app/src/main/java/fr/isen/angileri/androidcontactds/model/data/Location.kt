package com.example.example

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location (

  @SerializedName("street"      ) var street      : Street?      = Street(),
  @SerializedName("city"        ) var city        : String?      = null,
  @SerializedName("state"       ) var state       : String?      = null,
  @SerializedName("country"     ) var country     : String?      = null,
  @SerializedName("postcode"    ) var postcode    : Int?         = null,
  @SerializedName("coordinates" ) var coordinates : Coordinates? = Coordinates(),
  @SerializedName("timezone"    ) var timezone    : Timezone?    = Timezone()

) : Parcelable {}