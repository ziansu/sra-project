public boolean isMatchingPassword(java.lang.String password) {
    java.lang.System.out.println(pwHash);
    java.lang.System.out.println(password);
    return org.launchcode.ace.models.User.encoder.matches(password, pwHash);
}