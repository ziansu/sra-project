public void close(java.lang.String msg) {
    io.mycat.sqlengine.SQLJob curJob = sqlJob;
    if ((curJob != null) && (curJob.isFinished())) {
        curJob.teminate(msg);
        sqlJob = null;
    }
}