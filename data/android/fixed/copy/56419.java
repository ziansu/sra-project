@java.lang.Override
public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] header, java.lang.Throwable throwable, org.json.JSONObject response) {
    android.widget.Toast.makeText(context, ("Failure, Unable to remove: " + response), Toast.LENGTH_LONG).show();
}