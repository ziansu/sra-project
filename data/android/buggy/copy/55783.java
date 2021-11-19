@java.lang.Override
public double pidGet() {
    return (Robot.mDriveTrain.mLeftMotor1.getEncPosition()) / (Robot.mDriveTrain.mInchesToEncoderUnits);
}