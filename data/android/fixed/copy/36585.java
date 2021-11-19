@org.springframework.web.bind.annotation.RequestMapping(value = "/add")
public com.hk.task.model.JobInfo add(com.hk.task.model.JobInfo newJob) {
    int maxSortValue = jobInfoService.getMaxSortValue(newJob.getListId());
    newJob.setJobSort((maxSortValue + 1));
    jobInfoService.save(newJob);
    return newJob;
}