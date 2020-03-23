package id.putraprima.retrofit.api.services;


import id.putraprima.retrofit.api.models.AppVersion;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiInterface{
    @GET("/")
    Call<AppVersion> getAppVersion();
}
