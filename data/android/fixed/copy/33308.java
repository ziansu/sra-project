private java.lang.String updateClientsUsernameInHashmap(java.lang.String oldUsername, java.lang.String newUsername) {
    clients.remove(oldUsername);
    clients.put(newUsername, toClient);
    username = newUsername;
    return oldUsername;
}