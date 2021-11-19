@java.lang.Override
public void run() {
    try {
        if (apiRequests.verifyAccessToken(accessToken)) {
            auth = true;
        }
        latch.countDown();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}