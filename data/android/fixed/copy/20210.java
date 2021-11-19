public static java.lang.String bCryptHashPassword(java.lang.String plaintextPassowrd, java.lang.String salt) {
    return org.mindrot.jbcrypt.BCrypt.hashpw(plaintextPassowrd, salt);
}