@org.chromium.base.annotations.CalledByNative
static org.chromium.chrome.browser.offlinepages.downloads.OfflinePageDownloadItem createDownloadItem(java.lang.String guid, java.lang.String url, java.lang.String targetPath, long startTimeMs, long totalBytes) {
    return new org.chromium.chrome.browser.offlinepages.downloads.OfflinePageDownloadItem(guid, url, targetPath, startTimeMs, totalBytes);
}