@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, java.lang.String responseString, java.lang.Throwable throwable) {
    super.onFailure(statusCode, headers, responseString, throwable);
    android.widget.Toast.makeText(context, "Unable to unretweet", Toast.LENGTH_SHORT).show();
}