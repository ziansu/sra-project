public int getTotalScore(sourcePackage.Database base, java.sql.Connection connection) {
    if (base == null)
        return 0;
    
    return base.getUserTotalScore(this.userName, connection);
}