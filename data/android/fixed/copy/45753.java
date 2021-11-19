@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError volleyError) {
    volleyError.printStackTrace();
    if (null != resultListener)
        resultListener.onSearchError("Network Error");
    
}