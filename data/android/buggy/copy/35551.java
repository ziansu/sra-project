@com.xtremelabs.robolectric.internal.Implementation
@java.lang.Override
public final boolean moveToFirst() {
    try {
        resultSet.first();
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException("SQL exception in moveToFirst", e);
    }
    return super.moveToFirst();
}