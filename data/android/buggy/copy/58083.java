public int getInt(int i) throws java.sql.SQLException {
    java.lang.Object x = getObject(i);
    return x == null ? 0 : ((java.lang.Long) (x)).intValue();
}