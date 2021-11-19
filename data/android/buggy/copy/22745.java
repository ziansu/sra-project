private java.sql.Date currentSqlDate() {
    java.util.Date date = java.util.Calendar.getInstance().getTime();
    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
    return sqlDate;
}