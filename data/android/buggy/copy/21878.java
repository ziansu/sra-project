@java.lang.Override
byte[] getEncodedStatementName() {
    if ((batchedEncodedName) == null) {
        java.lang.String n = getStatementName();
        if (n != null) {
            batchedEncodedName = org.postgresql.core.Utils.encodeUTF8(n);
        }
    }
    return batchedEncodedName;
}