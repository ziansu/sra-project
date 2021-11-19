public boolean einloggen(java.lang.String username, java.lang.String password) {
    AccountManager am = new AccountManager(k);
    if (am.einloggen(username, password)) {
        this.username = username;
        return true;
    }
    return false;
}