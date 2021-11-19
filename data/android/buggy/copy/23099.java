public java.util.List<java.lang.Long> mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    java.util.List<java.lang.Long> list = new java.util.ArrayList<>();
    list.add(rs.getLong(1));
    return list;
}