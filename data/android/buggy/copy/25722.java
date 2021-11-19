private java.util.ArrayList<model.bugreports.BugReport> cloneList() {
    java.util.ArrayList<model.bugreports.BugReport> clonedList = new java.util.ArrayList<model.bugreports.BugReport>();
    for (model.bugreports.BugReport bugReport : getBugReportList())
        clonedList.add(bugReport.clone());
    
    return clonedList;
}