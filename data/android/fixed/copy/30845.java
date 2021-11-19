@java.lang.Override
public void onResponse(com.wilee8.coyotereader2.gson.StreamPrefs response) {
    com.wilee8.coyotereader2.mStreamPrefs = response;
    subscriber.onNext(null);
}