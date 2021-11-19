public static java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.String>> findAll() {
    org.launchcode.techjobs.console.JobData.loadData();
    java.lang.System.out.println((("\nNumber of Jobs: " + (org.launchcode.techjobs.console.JobData.allJobs.size())) + "\n"));
    return org.launchcode.techjobs.console.JobData.allJobs;
}