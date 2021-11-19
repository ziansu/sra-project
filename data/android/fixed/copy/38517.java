@java.lang.Override
public void onDestroy() {
    android.util.Log.e("Destroy", "Changes");
    super.onDestroy();
    java.lang.System.gc();
}