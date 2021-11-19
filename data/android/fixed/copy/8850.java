public void leave() {
    mUsername = null;
    mSocket.disconnect();
    mSocket.connect();
    startSignIn();
}