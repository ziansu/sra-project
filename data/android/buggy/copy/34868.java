public int totalSize() {
    int size = 0;
    for (com.atlauncher.data.Downloadable dl : this) {
        if (dl.needToDownload()) {
            size += dl.getFilesize();
        }
    }
    return size;
}