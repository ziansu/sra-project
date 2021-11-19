MiniWebStoreAccount verifyUser(java.lang.String username, int password) {
    MiniWebStoreAccount account = findAccount(username);
    return (account.getPasswordHash()) == password ? account : null;
}