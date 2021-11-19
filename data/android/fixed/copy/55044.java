public void addJob(Job.Job NewJob) {
    Job.JobMap.put(NewJob.toString(), NewJob);
    NewJob.Manager = this;
    JobsDirty = true;
}