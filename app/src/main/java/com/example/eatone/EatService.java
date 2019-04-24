package com.example.eatone;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EatService {
    @GET("latest.php")
    Call<Eat> getEat();
}
