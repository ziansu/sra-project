public com.twu.biblioteca.User addEntry(com.twu.biblioteca.User user, java.lang.String itemName) {
    issueRegister.put(user, itemName);
    return user;
}