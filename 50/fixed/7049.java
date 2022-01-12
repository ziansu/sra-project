public void stopDownloading(fr.uha.ensisa.jadoma.model.Download download) {
    if (download != null) {
        fr.uha.ensisa.jadoma.model.DownloadThread tmp = this.listDownloadThreads.get(this.listDownloads.indexOf(download));
        if (tmp.isRunning)
            tmp.interrupt();
        
    }
}