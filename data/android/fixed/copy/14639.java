public void setStmtInsertWCPaychecks() {
    this.stmtInsertWCPaychecks = "INSERT INTO APP.WC_PAYCHECKS" + ("(CLAIM_ID, WC_PC_TYPE, IS_CONTEST, IS_LATE, FT_HOURS, PAY_RECEIVED, PAY_DATE, PAY_START, PAY_END, BD_GROSS_AMNT, BD_AMNT_OWED, CONTEST_RSLVD) VALUES" + "(?,?,?,?,?,?,?,?,?,?,?,?)");
}