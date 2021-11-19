@java.lang.Override
public void onLoading(nuclei.media.MediaPlayerController controller) {
    loading.setVisibility(View.VISIBLE);
    if ((mHandler) != null)
        mHandler.start();
    
}