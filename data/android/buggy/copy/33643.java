@java.lang.Override
public void run() {
    if (requestMap.get(token).equals(url)) {
        requestMap.remove(token);
        mListener.onThumbnailDownloaded(token, bitmap);
    }
}