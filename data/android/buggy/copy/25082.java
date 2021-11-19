public void setPassword(com.example.myapp.login.db.User u, char[] unencryptedPassword) {
    u.setEncryptedPassword(getEncryptedPassword(unencryptedPassword));
    clearArray(unencryptedPassword);
}