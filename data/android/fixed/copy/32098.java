@java.lang.Override
public java.util.List<arc.nim.crawler.common.job.Job> getAllJobs(java.lang.Integer limit, java.lang.Integer offset) {
    return new java.util.ArrayList(jobService.getAllJobs(offset, limit));
}