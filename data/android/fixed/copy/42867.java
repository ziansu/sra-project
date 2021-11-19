public void call() {
    api = new io.rocketchat.core.RocketChatAPI(Main.serverurl);
    api.setReconnectionStrategy(null);
    api.setPingInterval(3000);
    api.connect(this);
}