@java.lang.Override
public void onCompleted() {
    latch.countDown();
}