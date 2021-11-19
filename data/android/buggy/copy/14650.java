public Shared.Domain.PlayerShared getPlayerFromToken(java.lang.String token) {
    Shared.Domain.PlayerShared updatedPlayer = Server.Controller.PlayerIconController.createPlayer(mapTokenPlayer.get(token).getUsername());
    mapTokenPlayer.replace(token, updatedPlayer);
    return updatedPlayer;
}