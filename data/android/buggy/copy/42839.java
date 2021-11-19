@java.lang.Override
public void onEventMainThread(com.edisonwang.ps.sample.SimpleActionEvent event) {
    onReceived(("Got " + (event.getClass().getSimpleName())));
}