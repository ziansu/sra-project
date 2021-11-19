@java.lang.Override
protected void onStart() {
    super.onStart();
    registerNetReceiver();
    registerHomeKeyReceiver();
}