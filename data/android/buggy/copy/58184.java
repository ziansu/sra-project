@java.lang.Override
public double getDesiredPositionZ(double timeInSeconds) {
    return (((scaleFactor) * (xycircle.getDesiredPositionOrdinate(timeInSeconds))) - (location.getY())) + (location.getZ());
}