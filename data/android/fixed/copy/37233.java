public java.util.concurrent.Future<com.alexwyler.jurl.Jurl> goAsync() {
    return com.alexwyler.jurl.Jurl.backgroundExecutor.submit(() -> this.go());
}