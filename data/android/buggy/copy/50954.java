@java.lang.Override
public void fling(int velocityY) {
    super.fling(velocityY);
    handler.removeCallbacks(mSnapRunner);
    android.util.Log.d("SCROLLVIEW", "Fling");
    mIsFling = true;
}