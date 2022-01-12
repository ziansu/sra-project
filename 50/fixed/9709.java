private boolean matches(tchepannou.mora.core.domain.Password password, java.lang.String clearPassword) {
    java.lang.String xpassword = passwordService.encrypt(clearPassword);
    return (xpassword != null) && (xpassword.equals(password.getValue()));
}