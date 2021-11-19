@retrofit2.http.GET(value = "3/movie/popular")
retrofit2.Call<br.com.gustavo.popularmovies.Result> fetchMoviesPopular(@retrofit2.http.Query(value = "api_key")
java.lang.String key);