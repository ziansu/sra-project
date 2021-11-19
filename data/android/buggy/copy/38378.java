public static int balancingJobs(int veh, int job) {
    if (veh == 0)
        return job;
    
    return java.lang.Math.round((job / veh));
}