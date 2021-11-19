@java.lang.SuppressWarnings(value = "deprecation")
private void saveItem(org.bukkit.entity.Player player) {
    playerMap.put(player, player.getInventory().getContents());
    player.getInventory().clear();
}