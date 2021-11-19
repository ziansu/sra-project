@retrofit2.http.GET(value = "/{path}")
public retrofit2.Call<com.christopherluc.popularmovies.data.MovieListResponse> getMovies(@retrofit2.http.Path(value = "path")
java.lang.String path);