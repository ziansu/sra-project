public synchronized boolean setPwd(java.io.File pwd) {
    return setPwd(pwd.toPath());
}