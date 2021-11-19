public edu.illinois.cs.mr.jm.JobID[] getJobIDs() {
    synchronized(jobs) {
        return ((edu.illinois.cs.mr.jm.JobID[]) (jobs.keySet().toArray()));
    }
}