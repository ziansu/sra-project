@retrofit.http.GET(value = "/weather")
void getWeather(@retrofit.http.Query(value = "lat")
java.lang.Double lat, @retrofit.http.Query(value = "lon")
java.lang.Double lon, @retrofit.http.Query(value = "units")
java.lang.String units, retrofit.Callback<com.libarguys.companion.model.WeatherResponse> callback);