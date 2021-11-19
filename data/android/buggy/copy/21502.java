private void writeJobOutputResource(java.lang.String path, com.kylinolap.job2.dao.JobOutputPO output) throws java.io.IOException {
    store.putResource(path, output, com.kylinolap.job2.dao.JobDao.JOB_OUTPUT_SERIALIZER);
}