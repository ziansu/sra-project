@java.lang.Override
public void onTaskComplete(android.graphics.Movie movie) {
    if (movie == null) {
        return ;
    }
    mAdapter.appendImageData(movie);
}