public boolean hasPlayer(java.lang.String user) {
    return (users.contains(user)) || (user.equalsIgnoreCase(leader));
}