@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException throwable) {
    if ((listener) != null)
        listener.onFailed(throwable);
    
}