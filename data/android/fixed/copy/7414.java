@java.lang.Override
protected void onStartLoading() {
    super.onStartLoading();
    if (!(com.jasonbutwell.popularmovies.BackgroundTask.TMDBLoader.isLoaded)) {
        com.jasonbutwell.popularmovies.Ui.LoadingIndicator.show(mBinding, true);
        forceLoad();
    }
}