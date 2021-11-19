public void removeUser(edu.harvard.lib.librarycloud.collections.model.User u) {
    edu.harvard.lib.librarycloud.collections.model.UserCollection uc = getUserCollection(u);
    if (uc != null) {
        users.remove(uc);
    }
}