@java.lang.Override
public void showTransferMessage(game_entities.Player player, java.lang.String fieldName, game_entities.Player owner, int amount) {
    desktop_resources.GUI.showMessage(java.lang.String.format(GUIarray[12], player.getName(), fieldName, amount, owner.getName()));
}