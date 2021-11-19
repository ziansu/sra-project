public java.sql.Date getSqlRegDate() {
    java.sql.Date sqlDate = new java.sql.Date(this.getRegistrationDate().getTime());
    return sqlDate;
}