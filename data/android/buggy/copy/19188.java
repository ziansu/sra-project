protected void logoutUser() {
    timer.cancel();
    timer.purge();
    currentUser.logout();
    newUserSet();
    updateTree();
}