package com.example.juneandroid;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiServices {
    @POST("login/v2/getOtp")
    Call<ResponseModel> getOtp(@Body JsonObject user);
}
