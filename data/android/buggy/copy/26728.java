private java.lang.String encodePassword(char[] password) {
    if (password == null) {
        return null;
    }
    return org.datacleaner.util.SecurityUtils.encodePasswordWithPrefix(password.toString());
}