package com.example.sleepysleep;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface MyAPICall {
    @Headers({
            "accept: application/json",
            "authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyMjdHNUwiLCJzdWIiOiI5QzVIOEMiLCJpc3MiOiJGaXRiaXQiLCJ0eXAiOiJhY2Nlc3NfdG9rZW4iLCJzY29wZXMiOiJ3aHIgd251dCB3cHJvIHdzbGUgd3dlaSB3c29jIHdzZXQgd2FjdCB3bG9jIiwiZXhwIjoxNjE4OTA4MzU0LCJpYXQiOjE2MTg4MjE5NTR9.cwbY2ZZJd2mLu90WyX9pwWmIsaA9pDXOHPsp1Is_cCY"
    })
    @GET("1/user/-/profile.json")
    Call<DataModel> getData();
}
