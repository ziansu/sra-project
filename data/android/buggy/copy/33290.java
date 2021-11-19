public boolean einloggen(java.lang.String username, java.lang.String password) {
    AccountManager am = new AccountManager(k);
    return am.einloggen(username, password);
}