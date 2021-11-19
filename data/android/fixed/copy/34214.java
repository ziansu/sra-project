public void connectUser(final DATA.model.User user) {
    DATA.model.User existingUser = lookForUser(user);
    if (existingUser != null) {
        reloadUser(user);
    }else {
        addUserInGroup(user, Group.DEFAULT_GROUP_NAME);
    }
}