public java.sql.ResultSet getUserById(int id) throws java.sql.SQLException {
    Manager.DBHelper help = new Manager.DBHelper();
    return help.findById(tableName, id);
}