public edu.illinois.cs.mr.jm.JobID[] getJobIDs() {
    synchronized(jobs) {
        return jobs.keySet().toArray(new edu.illinois.cs.mr.jm.JobID[0]);
    }
}