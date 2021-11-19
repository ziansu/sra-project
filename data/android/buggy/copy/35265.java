public void run() {
    if (b != null) {
        saveOutput(b);
        b.recycle();
    }
}