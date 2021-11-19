@java.lang.Override
public void run() {
    currentTransaction.markAsRolledBack();
    currentTransaction = null;
    connection.onError(null);
}