@java.lang.Override
protected boolean matchesSafely(java.lang.Double arg0) {
    return (java.lang.Math.abs((arg0 - storyCycleTimeMean))) >= ((0.005 * 0.5) * (arg0 + storyCycleTimeMean));
}