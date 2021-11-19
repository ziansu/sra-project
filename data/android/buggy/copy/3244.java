@java.lang.Override
public void before() {
    android.util.Log.w(com.google.android.perftesting.testrules.GetExecutionTime.LOG_TAG, "------GetExecutionTime before--------");
    try {
        android.util.Log.w(com.google.android.perftesting.testrules.GetExecutionTime.LOG_TAG, "--------------start------------");
        StartTime = java.lang.System.nanoTime();
    } catch (java.lang.Exception exception) {
    }
}