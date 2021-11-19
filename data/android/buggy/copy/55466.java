@java.lang.Override
public void config() {
    com.booboot.vndbandroid.util.Callback.showToast(context, message);
    if ((com.booboot.vndbandroid.util.Callback.countDownLatch) != null)
        com.booboot.vndbandroid.util.Callback.countDownLatch.countDown();
    
}