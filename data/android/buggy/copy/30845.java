@java.lang.Override
public void onResponse(com.wilee8.coyotereader2.gson.StreamPrefs response) {
    com.wilee8.coyotereader2.mStreamPrefs = response;
    android.util.Log.d("coyotereader", "return json: streamprefs");
    subscriber.onNext(null);
}