public void onPause() {
    if ((socket) != null) {
        socket.close();
        socket = null;
    }
    super.onPause();
}