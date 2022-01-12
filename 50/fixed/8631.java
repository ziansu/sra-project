public void prepareUserList(ua.javatests.adressbookweb.model.UserData userData) {
    java.lang.Boolean emptyUserList = userListIsEmpty();
    if (emptyUserList == true) {
        create(userData);
    }
}