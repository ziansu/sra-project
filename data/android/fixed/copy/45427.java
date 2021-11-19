@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    this.hasFocus = hasFocus;
    if ((this.onFocusChangeListener) != null) {
        this.onFocusChangeListener.onFocusChange(v, hasFocus);
    }
    focusChangedEvent();
}