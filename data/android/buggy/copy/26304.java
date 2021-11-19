private void startAppendToMovieListTask(int firstPageToAppend) {
    mAppendProgressSpinner.setVisibility(View.VISIBLE);
    if ((mLoadMovieListTask) != null) {
        return ;
    }
    mLoadMovieListTask = new com.example.android.popularmovies.PosterGridFragment.LoadMovieList();
    mLoadMovieListTask.execute(firstPageToAppend, com.example.android.popularmovies.PosterGridFragment.APPEND_PAGE_COUNT, com.example.android.popularmovies.PosterGridFragment.LoadMovieList.APPEND_TO_LIST_ON_COMPLETE);
}