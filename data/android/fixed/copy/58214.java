@java.lang.Override
public void onInterrupt() {
    if (!(isEnabled())) {
        setStatusEmpty();
    }else {
        setStatusWorking();
    }
}