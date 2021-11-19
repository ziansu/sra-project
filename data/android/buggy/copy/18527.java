@java.lang.Override
public java.lang.Long getSize() {
    java.util.Optional<io.github.lumue.getdown.core.download.downloader.DownloadProgress> downloadProgress = download.getProgress().getDownloadProgress();
    if (!(downloadProgress.isPresent()))
        return 1L;
    
    return downloadProgress.get().getSize();
}