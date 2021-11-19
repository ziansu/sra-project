public void setPassword(char[] password) {
    this.password = java.util.Arrays.copyOf(password, password.length);
}