public boolean moveJobToRunningStatus(com.zl.abstracts.AJob job) {
    if (!(job instanceof com.zl.jobs.WebCrawlingJob))
        return false;
    
    synchronized(this) {
        waitingJobs.remove(job);
        runningJobs.add(job);
    }
    return true;
}