public void onChat(org.bukkit.event.player.AsyncPlayerChatEvent event) {
    if ((pw.paradaux.simapi.chatHandler.getChatStatus()) == true) {
        event.setCancelled(true);
    }
}