@java.lang.Override
public void run() {
    if ((listener_) != null) {
        listener_.onBlurStateChanged(state);
    }
}