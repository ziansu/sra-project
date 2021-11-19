@java.lang.Override
protected void onResume() {
    super.onResume();
    active = true;
    onConnectCallbacks(new com.github.kubatatami.judonetworking.CallbacksConnector(this));
}