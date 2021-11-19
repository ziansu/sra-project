@java.lang.Override
public synchronized double getCapacity(final double time) {
    return (getFlowCapacityPerSec()) * (getCapacityPeriod());
}