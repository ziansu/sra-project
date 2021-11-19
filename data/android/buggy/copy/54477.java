public void deleteAllGames() throws concrete.SQLException {
    java.sql.Connection connection = database.DB.openConnection();
    java.sql.PreparedStatement ps = con.prepareStatement(concrete.GiocoDao.DELETE_ALL);
    java.sql.ResultSet rset = ps.executeUpdate();
    ps.close();
    rset.close();
}