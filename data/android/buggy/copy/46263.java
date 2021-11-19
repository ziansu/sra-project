@java.lang.Override
protected void onPause() {
    super.onPause();
    android.util.Log.d(com.playxiangqi.hoxchess.MainActivity.TAG, "onPause");
    com.playxiangqi.hoxchess.NetworkController.getInstance().removeListener(this);
    com.playxiangqi.hoxchess.MessageManager.getInstance().removeListener(this);
}