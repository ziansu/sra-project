@java.lang.Override
public void run() {
    try {
        final double lNewPowerValue = mCurrentPowerInMilliWattVariable.get().doubleValue();
        mCurrentPowerInMilliWattVariable.sync(lNewPowerValue, true);
    } catch (final java.lang.Throwable e) {
        e.printStackTrace();
    }
}