@java.lang.Override
public void onError(com.androidnetworking.error.ANError anError) {
    if (listener != null)
        listener.updateError(parseError(anError));
    
}