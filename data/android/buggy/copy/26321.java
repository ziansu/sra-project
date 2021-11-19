@java.lang.Override
public com.coolerfall.download.Downloader copy() {
    return com.coolerfall.download.OkHttpDownloader.create(client.newBuilder().build());
}