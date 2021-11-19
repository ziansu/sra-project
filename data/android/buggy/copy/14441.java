@java.lang.Override
protected void onPause() {
    super.onPause();
    com.hermes.comics.services.ComicsPageFetcherService.unregister(getContext(), receiver);
}