public long update(final com.lumens.sysdb.entity.Job job) {
    simplePrepareStatTransactionExecute(sqlManager.getSQL("JobDAO/UpdateJob"), job.name, job.description, job.repeat, job.interval, job.startTime, job.endTime, job.id);
    return job.id;
}