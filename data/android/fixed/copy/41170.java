@java.lang.Override
public void run() {
    if (!(url.equals(mRequestMap.get(token))))
        return ;
    
    mRequestMap.remove(token);
    mListener.onThumbnailDownloaded(token, bitmap);
}