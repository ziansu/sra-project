@java.lang.Override
public void setLogScale(boolean enabled) throws java.lang.IllegalStateException {
    boolean old = isLogScaleEnabled();
    super.setLogScale(enabled);
    fireAxisLogScaleChanged(old, logScaleEnabled);
}