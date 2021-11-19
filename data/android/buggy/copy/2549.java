private java.net.HttpURLConnection openConnection(int offset, int timeout) throws com.danikula.videocache.ProxyCacheException, java.io.IOException {
    return openConnection(offset, timeout, false);
}