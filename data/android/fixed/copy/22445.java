@java.lang.Override
public void onStop() {
    super.onStop();
    if ((mCursor) != null) {
        mCursor.close();
    }
}