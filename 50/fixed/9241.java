public void connectToServer() {
    boolean connected = false;
    gc = new orbit.OrbitGame.GameClient();
    gc.start();
}