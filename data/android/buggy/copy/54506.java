public void disconnectUser(final DATA.model.User user) {
    IHM.controllers.FriendsSubController.UserHBoxCell existingUser = lookForUser(user.getUid());
    if (existingUser != null) {
        reloadUser(existingUser.getUser());
    }
}