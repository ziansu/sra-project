public void cancelDownload() {
    if (serviceConnectFlag)
        downloadBinder.cancelDownload(false);
    
}