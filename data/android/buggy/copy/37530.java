public void newReportToDB(Model.Report R) {
    try {
        nrm.reportToDataBase(R, con);
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println(("Error in creating a report, No changes in the database" + ex));
    }
}