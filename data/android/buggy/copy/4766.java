@java.lang.Override
public int getInt(int columnIndex) throws java.sql.SQLException {
    return isNull(columnIndex) ? 0 : ((int) (resultSet.getLong(columnIndex)));
}