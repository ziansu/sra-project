@java.lang.Override
public void resume(cn.woblog.android.downloader.domain.DownloadInfo downloadInfo) {
    if (isExecute()) {
        cacheDownloadTask.remove(downloadInfo.getId());
        download(downloadInfo);
    }
}