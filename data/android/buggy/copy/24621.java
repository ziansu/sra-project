private void cancelLoadingPoems() {
    com.almoturg.sprog.data.PoemsLoader.cancelAllDownloads(activity);
    updating = false;
}