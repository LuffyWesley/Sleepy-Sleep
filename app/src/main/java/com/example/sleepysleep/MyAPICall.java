package com.example.sleepysleep;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface MyAPICall {
    @Headers({
            "accept: application/json",
            "authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyMjdHNUwiLCJzdWIiOiI5QzVIOEMiLCJpc3MiOiJGaXRiaXQiLCJ0eXAiOiJhY2Nlc3NfdG9rZW4iLCJzY29wZXMiOiJ3aHIgd251dCB3cHJvIHdzbGUgd3dlaSB3c29jIHdhY3Qgd3NldCB3bG9jIiwiZXhwIjoxNjE5MDEzNTk3LCJpYXQiOjE2MTg5MjcxOTd9.hIyy6P8xLKLfwDI_NhjktCWcvgQhND2goGtzkVzc_8Q"
    })
    @GET("1/user/-/profile.json")
    Call<DataModel> getData();
}
