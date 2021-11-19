public int getTotalPawnValueOfPlayer(player.Player player, controllers.FieldController fc) {
    int value = (player.getBalance()) + ((int) ((fc.getPropertyValueNotPawned(player)) * 0.5));
    return value;
}