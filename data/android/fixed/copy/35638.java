public void disconnect() {
    if ((this.con) != null) {
        try {
            this.con.close();
        } catch (java.sql.SQLException ex) {
            java.lang.System.out.println("Can't close connection");
        }
    }
}