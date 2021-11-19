@java.lang.Override
public void newDownloadIndexes() {
    if ((banner) != null) {
        banner.updateBannerInProgress(false);
    }
    updateSearchText(searchText);
}