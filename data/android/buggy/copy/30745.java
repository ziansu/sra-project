@java.lang.Override
protected void onResume() {
    org.simlar.logging.Lg.i("onResume");
    super.onResume();
    if (!(mCommunicator.register(this, org.simlar.widgets.CallActivity.class))) {
        finish();
    }
}