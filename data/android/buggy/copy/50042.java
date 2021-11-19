public java.lang.String getHashPassword(java.lang.String password) {
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder passwordEncoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    java.lang.String hashedPassword = passwordEncoder.encode(password);
    java.lang.System.out.println(hashedPassword);
    return hashedPassword;
}