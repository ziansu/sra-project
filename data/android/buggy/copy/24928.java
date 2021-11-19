public void incrementFailedLoginCount() {
    if ((this.failedLoginCount) == null) {
        this.failedLoginCount = 0L;
    }
    (this.failedLoginCount)++;
}