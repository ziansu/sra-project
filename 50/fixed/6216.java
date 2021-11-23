public java.sql.ResultSet GetFavoriteShopsByUser(java.lang.String username) throws java.sql.SQLException {
    ConnectToDB();
    stmt = conn.createStatement();
    java.lang.String sql = "";
    java.sql.ResultSet rs = stmt.executeQuery(sql);
    return rs;
}