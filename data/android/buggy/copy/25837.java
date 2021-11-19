@java.lang.Override
public void onBoxOfficeMoviesLoaded(java.util.ArrayList<com.bojie.materialtest.pojo.Movie> movieArrayList) {
    com.bojie.materialtest.logging.L.t(getActivity(), "onBoxOfficeMoviesLoaded Fragment");
    mBoxOfficeAdapter.setMovieArrayList(mMoviesList);
}