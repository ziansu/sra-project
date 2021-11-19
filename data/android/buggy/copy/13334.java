@org.testng.annotations.Test
public void useAppContext() throws java.lang.Exception {
    android.content.Context appContext = android.support.test.InstrumentationRegistry.getTargetContext();
    junit.framework.Assert.assertEquals("com.example.dellpc.wechat", appContext.getPackageName());
}