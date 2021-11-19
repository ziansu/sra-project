@java.lang.Override
public void onAuthCreated(com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo info) {
    authLatch.countDown();
}