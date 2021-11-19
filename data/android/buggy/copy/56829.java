public boolean testPassword(com.example.myapp.login.db.User u, char[] unencryptedPassword) {
    boolean ret = u.getEncryptedPassword().equals(getEncryptedPassword(unencryptedPassword));
    clearArray(unencryptedPassword);
    return ret;
}