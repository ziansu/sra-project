@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.v(TAG, ("onDestroy() called for fragment with tag: " + (mTag)));
}