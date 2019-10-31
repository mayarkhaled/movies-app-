package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //builder
        //url : http/------/theLastPart
        Retrofit retrofit = new Retrofit.Builder().baseUrl(" http//------/")
                .addConverterFactory(GsonConverterFactory.create()) //type of converter
        .build();

         //fill interface body
        apiInterface apiInterface = retrofit.create(com.example.retrofit.apiInterface.class);
        //call
        Call<post>call = apiInterface.getPost();
        call.enqueue(new Callback<post>() {
            @Override
            public void onResponse(Call<post> call, Response<post> response) {
               // response.body().getId();
                //response.body().getTitle();
            }

            @Override
            public void onFailure(Call<post> call, Throwable t) {

            }
        });

    }
}
