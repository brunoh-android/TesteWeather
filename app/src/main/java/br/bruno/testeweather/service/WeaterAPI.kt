package br.bruno.testeweather.service

import br.bruno.testeweather.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.openweathermap.org/data/2.5/weather?q=bing%C3%B6l&appid=7b829d53d2e1149c35421253864e6514

interface WeaterAPI {

    @GET("data/2.5/weather?&units=metric&appid=7b829d53d2e1149c35421253864e6514")
    fun getData(
        @Query("q")cityName: String
    ):Single<WeatherModel>
}