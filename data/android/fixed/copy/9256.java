@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    synchronized(this) {
        b.recycle();
        b = null;
    }
}