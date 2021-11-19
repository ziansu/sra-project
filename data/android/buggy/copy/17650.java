@java.lang.Override
public int getHeatCapacityWithWater() {
    if (hasLaserHeatSinks()) {
        return getHeatCapacity();
    }
    return (getHeatCapacity()) + (java.lang.Math.min(sinksUnderwater(), 6));
}