@java.lang.Override
public void onBackPressed() {
    if (mConnection.isBound()) {
        mConnection.setBound(false);
    }
    super.onBackPressed();
}