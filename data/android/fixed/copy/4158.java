public double GetEncPosInches() {
    return (Robot.mDriveTrain.mLeftMotor1.getEncPosition()) / (Robot.mDriveTrain.mInchesToEncoderUnits);
}