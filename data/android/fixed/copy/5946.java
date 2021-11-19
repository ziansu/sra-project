@org.junit.Test
public void testAndroidParamsProjectNumberOverridesLocal() throws java.lang.Exception {
    OneSignalInit();
    com.test.onesignal.MainOneSignalClassRunner.threadAndTaskWait();
    junit.framework.Assert.assertNotSame("123456789", ShadowPushRegistratorGPS.lastProjectNumber);
}