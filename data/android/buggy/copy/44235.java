@java.lang.Override
public boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i1) {
    android.util.Log.d(App.TAG, "onError");
    if ((callbacksRef.get()) != null)
        callbacksRef.get().onError();
    
    return false;
}