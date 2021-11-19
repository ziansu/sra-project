public void cancel() {
    canceled = true;
    interrupt();
}