@com.xtremelabs.robolectric.internal.Implementation
@java.lang.Override
public boolean moveToNext() {
    try {
        resultSet.next();
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException("SQL exception in moveToNext", e);
    }
    return super.moveToNext();
}