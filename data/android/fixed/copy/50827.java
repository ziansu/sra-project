public void onPause() {
    tC.setTrue();
    new ayapplications.chat.sendString(socket, serverAddress, serverPort, drop).start();
    super.onPause();
}