public hudson.model.Job getJob() {
    if ((this.job) == null) {
        this.job = jenkins.model.Jenkins.getInstance().getItemByFullName(this.jobName, hudson.model.Job.class);
    }
    return this.job;
}