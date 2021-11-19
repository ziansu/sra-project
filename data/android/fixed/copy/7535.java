@java.lang.Override
public java.lang.Object start() {
    domDb.removeAll(transaction, firstChild);
    try {
        domDb.flush();
    } catch (final org.exist.storage.DBException e) {
        org.exist.storage.LOG.error(("start() - " + "error while removing doc"), e);
    }
    return null;
}