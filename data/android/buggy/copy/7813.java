@java.lang.Override
public void onSuccess() {
    android.util.Log.d("LoyalUtil", "picasso on success");
    callback.run();
}