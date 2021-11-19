@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError volleyError) {
    volleyError.printStackTrace();
    resultListener.onSearchError("Network Error");
}