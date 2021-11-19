@java.lang.Override
public void onCompleted() {
    onCompleted(innerScheduler.now());
}