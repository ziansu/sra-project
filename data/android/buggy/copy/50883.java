public boolean any() {
    for (com.atlauncher.data.Downloadable dl : this) {
        if (dl.needToDownload()) {
            return true;
        }
    }
    return false;
}