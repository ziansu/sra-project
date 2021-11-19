public boolean verifyPassword(java.lang.String password) throws java.lang.Exception {
    java.lang.String existingPassword = studentInfo.getPassword();
    return password.equals(existingPassword);
}