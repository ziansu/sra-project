public void removeUser(server.User nick, java.lang.String userMask) {
    members.remove(nick);
    for (server.User user : members) {
        user.sendMessage((((":" + userMask) + " PART ") + (name)));
    }
}