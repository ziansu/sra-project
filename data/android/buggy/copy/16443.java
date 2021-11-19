@java.lang.Override
public java.lang.String getState() {
    java.util.Optional<io.github.lumue.getdown.core.download.downloader.DownloadProgress> downloadProgress = download.getDownloadProgress();
    if (!(downloadProgress.isPresent()))
        return "unknown";
    
    return download.getState().name();
}