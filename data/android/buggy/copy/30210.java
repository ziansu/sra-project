@java.lang.Override
public void onDestroy() {
    droneConnectionService.removeConnectionListener(this);
    messagingConnectionService.removeConnectionListener(this);
}