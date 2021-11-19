@java.lang.Override
public java.sql.Time get(java.sql.ResultSet resultSet, int columnIndex) throws java.sql.SQLException {
    java.sql.Time value = resultSet.getTime(columnIndex, com.torodb.backend.converters.sql.TimeSqlBinding.CALENDAR);
    if (resultSet.wasNull()) {
        return null;
    }
    return value;
}