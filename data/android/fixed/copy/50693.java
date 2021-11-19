@java.lang.Override
protected void onStartLoading() {
    if ((movieList) != null) {
        deliverResult(movieList);
    }else {
        mLoadingIndicator.setVisibility(View.VISIBLE);
        forceLoad();
    }
}