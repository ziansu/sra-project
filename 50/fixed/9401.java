@java.lang.Override
public void onLoading(nuclei.media.MediaPlayerController controller) {
    if ((loading) != null)
        loading.setVisibility(View.VISIBLE);
    
    if ((mHandler) != null)
        mHandler.start();
    
}