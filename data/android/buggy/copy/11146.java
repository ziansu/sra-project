public void setPwHash(java.lang.String password) {
    this.pwHash = org.launchcode.ace.models.User.hashPassword(password);
}