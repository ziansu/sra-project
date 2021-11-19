@java.lang.Override
public int getItemCount() {
    return (mMoviesList.getResults()) == null ? 0 : mMoviesList.getResults().size();
}