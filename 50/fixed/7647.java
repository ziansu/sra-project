private void onError() {
    android.util.Log.d(com.juztoss.rhythmo.audio.AdvancedMediaPlayer.class.toString(), "onErrorCalled");
    if ((mOnErrorListener) != null)
        mOnErrorListener.onError();
    
}