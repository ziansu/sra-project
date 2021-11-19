@java.lang.Override
public void moviesOnClick(int pPosition) {
    mView.showMovieDetails(mMoviesRepository.getMovie(pPosition), pPosition);
}