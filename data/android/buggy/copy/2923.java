@java.lang.Override
public void onResume() {
    super.onResume();
    active = true;
    onConnectCallbacks(new com.github.kubatatami.judonetworking.CallbacksConnector(this));
}