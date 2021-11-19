public void sendMessage(java.lang.String message) {
    for (map.minimap.games.User u : users) {
        u.sendMessage(message);
    }
}