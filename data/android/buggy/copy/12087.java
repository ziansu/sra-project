@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.d(TAG, error.toString());
    handler.onError(error.getMessage());
    progress.hide();
}