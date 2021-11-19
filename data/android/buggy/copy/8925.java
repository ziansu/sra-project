static void downloadSong(java.lang.String youtubeReference) throws java.io.IOException, java.lang.InterruptedException {
    application.DownloadThread dt = new application.DownloadThread(application.FXController.songFullTitle, youtubeReference);
    dt.start();
    application.FXController.YoutubeURL.clear();
}