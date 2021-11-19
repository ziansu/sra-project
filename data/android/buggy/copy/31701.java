public boolean checkIsUserSignedIn(de.opti4apps.timelytest.data.User user, io.objectbox.Box<de.opti4apps.timelytest.data.User> usersBox) {
    user = usersBox.query().equal(User_.isSingedIn, true).build().findFirst();
    return user != null;
}