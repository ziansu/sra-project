public void addDummyJobs() {
    ca.uwaterloo.jobmine.data.SQLJobDatabaseOperations DB = new ca.uwaterloo.jobmine.data.SQLJobDatabaseOperations(ctx);
    java.util.List jobList = DB.getJobList();
    for (ca.uwaterloo.jobmine.models.Job job : ca.uwaterloo.jobmine.dummy.DummyContent.ITEMS) {
        DB.insertJob(job);
    }
}