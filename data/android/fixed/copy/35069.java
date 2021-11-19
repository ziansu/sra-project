@java.lang.Override
public void run() {
    try {
        final double lNewPowerValue = mCurrentPowerInMilliWattVariable.get().doubleValue();
        mCurrentPowerInMilliWattVariable.set(lNewPowerValue);
    } catch (final java.lang.Throwable e) {
        e.printStackTrace();
    }
}