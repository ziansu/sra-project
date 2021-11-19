@java.lang.Override
public boolean hasTouchedDown() {
    touchdownDetectedFiltered.update(((java.lang.Math.abs(joint.getTau())) < (torqueThreshold.getDoubleValue())));
    return touchdownDetectedFiltered.getBooleanValue();
}