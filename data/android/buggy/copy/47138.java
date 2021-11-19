public void kill() {
    if ((process) != null) {
        output();
        process.destroyForcibly();
    }
}