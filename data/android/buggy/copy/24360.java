public void closeConn() {
    try {
        rs.close();
        st.close();
        conn.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}