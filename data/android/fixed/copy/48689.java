public static void main(java.lang.String[] args) {
    try {
        com.forwardline.api.persistence.ConnectionManager cm = new com.forwardline.api.persistence.ConnectionManager();
        java.sql.Connection conn = cm.getConnection();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}