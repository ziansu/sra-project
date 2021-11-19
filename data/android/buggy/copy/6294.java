public java.util.ArrayList outputUserReport() {
    User user;
    for (java.lang.Object user1 : users) {
        user = ((User) (user1));
        java.lang.System.out.println(user.createTestUserOutput());
    }
    java.lang.System.out.println(userEntries);
    return users;
}