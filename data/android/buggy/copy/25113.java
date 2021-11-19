@java.lang.Override
public void onFailure(java.io.IOException e, com.squareup.okhttp.Response response) {
    pingTask.cancel();
    failListener.onFailed(e);
}