@java.lang.Override
public void onCallForwardingIndicatorChanged(boolean cfi) {
    android.util.Log.v(com.itachi46.autoredirect.app.MainActivity.TAG, "call forwarding indicator changed.");
    super.onCallForwardingIndicatorChanged(cfi);
    if ((forwardToggle.isChecked()) != cfi) {
        forwardingChangeDetected = true;
        forwardToggle.setChecked(cfi);
    }
}