@java.lang.Override
public boolean addBugReport(com.cs3733.teamd.Model.Entities.Report report) {
    boolean result = dbHandler.addBugReport(report.tagText, report.commentText, report.status);
    if (!result) {
        java.lang.System.err.println("Error Adding Bug Report");
        return result;
    }
    return result;
}