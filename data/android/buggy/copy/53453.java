public com.myjob.common.QueryResult<com.myjob.entity.Job> queryMyPublishedJobs(com.myjob.criteria.JobQueryCriteria criteria, long companySid) {
    criteria.setCompanySid(companySid);
    criteria.setCompanyName(new java.lang.String[]{ "IBM" });
    return jobDao.query(criteria);
}