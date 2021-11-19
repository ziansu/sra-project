public void disconnect() {
    if ((serviceMessenger) != null) {
        disconnectFromService();
        context.unbindService(serviceConnection);
        state = null;
    }
}