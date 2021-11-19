@java.lang.Override
protected void setup(com.udbac.hadoop.mr.Context context) throws java.io.IOException, java.lang.InterruptedException {
    com.udbac.hadoop.mr.LogAnalyserSrbMR.SessionMapper.fieldsColumn = context.getConfiguration().get("fields.column").split(",");
    com.udbac.hadoop.mr.LogAnalyserSrbMR.SessionMapper.validDates = context.getConfiguration().get("logs.date");
}