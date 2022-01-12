@java.lang.Override
public void run() {
    if ((currentTransaction) != null) {
        currentTransaction.markAsRolledBack();
        currentTransaction = null;
        connection.onError(null);
    }
}