public void disconnectUser(final DATA.model.User user) {
    DATA.model.User existingUser = lookForUser(user);
    if (existingUser != null) {
        reloadUser(user);
    }
}