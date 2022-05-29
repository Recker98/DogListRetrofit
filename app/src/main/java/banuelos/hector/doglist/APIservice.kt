package banuelos.hector.doglist

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIservice {
    @GET
    fun getDogsByBreeds(@Url url:String): Response<dogresponse>
}