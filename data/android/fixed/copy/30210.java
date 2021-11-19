@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    droneConnectionService.removeConnectionListener(this);
    messagingConnectionService.removeConnectionListener(this);
}