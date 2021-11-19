@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    android.util.Log.d("DEBUG", throwable.toString());
}