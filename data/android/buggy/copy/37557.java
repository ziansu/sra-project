private boolean checkCredentials(com.ecocitrus.Users user, java.lang.String password) {
    int hash = generateHash(password);
    if ((user.getPassword()) == hash) {
        return true;
    }
    return false;
}