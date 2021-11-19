private void startAppendToMovieListTask(int firstPageToAppend) {
    if ((mLoadMovieListTask) != null) {
        return ;
    }
    mAppendProgressSpinner.setVisibility(View.VISIBLE);
    mLoadMovieListTask = new com.example.android.popularmovies.PosterGridFragment.LoadMovieList();
    mLoadMovieListTask.execute(firstPageToAppend, com.example.android.popularmovies.PosterGridFragment.APPEND_PAGE_COUNT, com.example.android.popularmovies.PosterGridFragment.LoadMovieList.APPEND_TO_LIST_ON_COMPLETE);
}