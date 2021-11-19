@java.lang.Override
public void setEnabled(boolean enabled) {
    super.setEnabled(enabled);
    forceRedraw();
}