@java.lang.Override
public void setEnabled(boolean enabled) {
    if (!enabled) {
        this.enabled = false;
        java.lang.System.out.println(this.enabled);
        invalidate();
    }
}