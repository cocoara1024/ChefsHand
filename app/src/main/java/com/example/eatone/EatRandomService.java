package com.example.eatone;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EatRandomService {
    @GET("random.php")
    Call<Random> getRandom();
}

