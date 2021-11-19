@java.lang.Override
public void onDetach() {
    super.onDetach();
    android.util.Log.d(udacity.nanodegree.android.p2.model.movie.MoviesFragment.TAG, "onDetach: ");
    onMovieSelectedListener = OnMovieSelectedListener.EMPTY;
}