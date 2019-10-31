package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiInterface {

    //get call from json file as "post"
    //url : http/------/theLastPart
    @GET("theLastPart")
    public Call<post> getPost();

}
