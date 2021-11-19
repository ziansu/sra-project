@java.lang.Override
public byte getByte(int columnIndex) throws java.sql.SQLException {
    return isNull(columnIndex) ? 0 : ((byte) (resultSet.getLong(columnIndex)));
}