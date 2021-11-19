private void disconnectFromWatch() {
    if (boundToService) {
        connectedToWatch = false;
        activity.unbindService(serviceConnection);
        boundToService = false;
    }
}