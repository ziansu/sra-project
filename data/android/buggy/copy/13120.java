public int getTotalScore(sourcePackage.Database base, java.sql.Connection connection) {
    return base.getUserTotalScore(this.userName, connection);
}