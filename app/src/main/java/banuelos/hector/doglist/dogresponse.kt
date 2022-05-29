package banuelos.hector.doglist

import com.google.gson.annotations.SerializedName

data class dogresponse (
    @SerializedName("status") var status:String, var message:String,
    @SerializedName("message") var images: List<String>
)