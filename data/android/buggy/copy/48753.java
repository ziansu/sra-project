@java.lang.Override
public java.lang.Boolean call(com.etiennelawlor.moviehub.data.model.MoviesPage moviesPage) {
    android.util.Log.d(com.etiennelawlor.moviehub.data.source.movies.MoviesRepository.TAG, ("call: moviesPage.isExpired() - " + (moviesPage.isExpired())));
    return !(moviesPage.isExpired());
}