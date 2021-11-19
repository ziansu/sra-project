@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(com.example.jamie.popularmovies.fragments.MainMovieFragment.MAIN_MOVIE_LOADER, null, this);
    com.example.jamie.popularmovies.fragments.MainMovieFragment.mPosition = getActivity().getIntent().getIntExtra(MovieContract.MovieEntry.POSITION, 0);
    super.onActivityCreated(savedInstanceState);
}