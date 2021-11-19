public void setPasswordSalt(java.lang.String passwordSalt) {
    org.apache.commons.lang3.Validate.notBlank(passwordSalt, "The password salt cannot be blank");
    this.passwordSalt = passwordSalt;
}