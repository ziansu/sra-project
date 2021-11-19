@java.lang.Override
public void onResume() {
    super.onResume();
    if ((service) != null) {
        unbindService(connection);
        service = null;
    }
}