private int defPort() {
    return secure() ? 443 : 80;
}