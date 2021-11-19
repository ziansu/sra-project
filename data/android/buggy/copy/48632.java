@java.lang.Override
public void onItemSelected() {
    recyclerViewItem.setScaleY(0.95F);
    canPullDown = false;
    android.util.Log.d("mmga", "canPullDownFalse");
}