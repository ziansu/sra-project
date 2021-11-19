public void setStatus(java.lang.String newStatus, java.sql.Connection connection, sourcePackage.Database base) {
    if (base != null)
        base.setUserStatus(this.userName, newStatus, connection);
    
}