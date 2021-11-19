@java.lang.Override
public void run() {
    if (url.equals(requestMap.get(token))) {
        requestMap.remove(token);
        mListener.onThumbnailDownloaded(token, bitmap);
    }
}