public void postStop() {
    controllers.LobbyController.removePlayer(this.out);
}