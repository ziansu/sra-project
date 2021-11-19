public zlc.season.rxdownload.entity.DownloadRange readDownloadRange(java.lang.String url, int i) throws java.io.IOException {
    return mFileHelper.readDownloadRange(getTempFile(url), i);
}