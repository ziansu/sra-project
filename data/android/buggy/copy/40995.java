@java.lang.Override
public void onError(java.lang.Exception e) {
    android.util.Log.e("ChatSocket", ("Encountered error " + (e.getMessage())));
    e.printStackTrace();
}