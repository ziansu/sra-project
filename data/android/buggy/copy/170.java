@java.lang.Override
public void onBindViewHolder(com.example.android.popularmoviesapp.MovieAdapter.MovieViewHolder holder, int position) {
    com.example.android.popularmoviesapp.Movie movie = mMoviesList.get(position);
    holder.bind(movie);
    android.util.Log.d(com.example.android.popularmoviesapp.MovieAdapter.TAG, ("onBindViewHolder:#" + position));
}