@com.xtremelabs.robolectric.internal.Implementation
@java.lang.Override
public boolean moveToPosition(int pos) {
    try {
        resultSet.absolute((pos + 1));
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException("SQL exception in moveToPosition", e);
    }
    return super.moveToPosition(pos);
}