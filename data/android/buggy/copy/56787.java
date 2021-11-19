public void setPassword(java.lang.String password) {
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bcryptEncoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
    this.password = bcryptEncoder.encode(password);
}