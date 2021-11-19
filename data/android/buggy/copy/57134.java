public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        connector.getConnection(url, username, password);
    } catch (java.sql.SQLException ex) {
        ex.printStackTrace();
    }
}