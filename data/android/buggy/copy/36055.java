public void start() {
    mResult = null;
    if ((mLogDumper) == null)
        mLogDumper = new com.app.teacup.util.LogcatUtils.LogDumper("MediaResourceGetter");
    
    mLogDumper.start();
}