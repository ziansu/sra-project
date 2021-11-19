@retrofit.http.GET(value = "discover/movie")
retrofit.Call<com.technobells.rohit.movieexplorer.entity.JsonRequestDiscoverMovieResult> getDiscoverMovieFeed(@retrofit.http.Query(value = "sort_by")
java.lang.String sortBy, @retrofit.http.Query(value = "page")
int page, @retrofit.http.Query(value = "voteCount.gte")
int minVoteCount, @retrofit.http.Query(value = "api_key")
java.lang.String apiKey);