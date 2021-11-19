public void updateState(com.milanix.example.downloader.data.dao.Download.DownloadState state) {
    if (null == (download))
        download.setState(state);
    
}