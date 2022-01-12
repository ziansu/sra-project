@java.lang.Override
public void run() {
    callbackContext.success((com.marketo.Marketo.isSecureModeEnabled() ? 1 : 0));
}