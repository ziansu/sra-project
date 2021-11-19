@java.lang.Override
public void onResponse(com.wilee8.coyotereader2.gson.UserInfo response) {
    com.wilee8.coyotereader2.mUserId = response.getUserId();
    android.util.Log.d("coyotereader", "return json: userid");
    subscriber.onNext(null);
}