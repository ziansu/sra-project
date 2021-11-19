public static java.lang.String bCryptHashPassword(java.lang.String plaintextPassowrd) {
    java.lang.String salt = org.mindrot.jbcrypt.BCrypt.gensalt(crypto.encryptor.util.HashFunctionUtil.BCRYPT_WORKLOAD);
    java.lang.String hashedPassword = org.mindrot.jbcrypt.BCrypt.hashpw(plaintextPassowrd, salt);
    return hashedPassword;
}