public void setStmtSelectAllClaimants() {
    try {
        this.stmtSelectAllClaimants = this.dbConnection.prepareStatement("SELECT * FROM APP.CLAIMANTS");
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}