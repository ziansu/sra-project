@org.junit.Test
public void addSpider() {
    jackals.job.pojo.JobInfo jobInfo = jackals.simples.News163.job();
    jobInfo.setJobModel(Constants.JobModel.addSpider);
    jobManager.addSpider(jobInfo, "20");
    jobManager.addSpider(jobInfo, "30");
}