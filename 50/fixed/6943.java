@android.support.annotation.CallSuper
protected void doLoadItems() {
    isLoading = true;
    if ((adapter) != null) {
        adapter.showLoadingState(isLoading);
    }
    onDoLoadItems();
    timber.log.Timber.d("Loading items ...");
}