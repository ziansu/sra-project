public void cancelJob() {
    this.cancel = true;
    if ((this.future) != null) {
        this.future.cancel(true);
    }
}