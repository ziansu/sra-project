@java.lang.Override
public void variableChanged(us.ihmc.yoVariables.variable.YoVariable<?> v) {
    if (update.getBooleanValue()) {
        kd.set(us.ihmc.robotics.controllers.pidGains.GainCalculator.computeDerivativeGain(kp.getDoubleValue(), zeta.getDoubleValue()));
    }
}