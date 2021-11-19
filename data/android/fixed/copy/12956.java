@org.junit.Before
public void setUp() {
    de.lemo.dms.core.config.ServerConfiguration.getInstance().loadConfig("/lemo");
    testCourseId = 1L;
    trainCourseId = 1L;
    startTime = 0L;
    endTime = java.lang.Long.MAX_VALUE;
    qDatabase = new de.lemo.dms.processing.questions.QDatabase();
}