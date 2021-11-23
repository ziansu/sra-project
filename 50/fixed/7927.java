@java.lang.Override
public void handleMessage(android.os.Message msg) {
    mNetworkService.downloadImage(msg.what);
}