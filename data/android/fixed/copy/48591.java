public com.twu.biblioteca.User addEntry(java.lang.String itemName, com.twu.biblioteca.User user) {
    issueRegister.put(itemName, user);
    return user;
}