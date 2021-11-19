public void connectUser(final DATA.model.User user) {
    IHM.controllers.FriendsSubController.UserHBoxCell existingUser = lookForUser(user.getUid());
    if (existingUser != null) {
        reloadUser(user);
    }else {
        addUserInGroup(user, Group.DEFAULT_GROUP_NAME);
    }
}