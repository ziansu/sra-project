@java.lang.Override
public void close() {
    if (!(success)) {
        currentTransaction.failure();
    }
}