public void resetDriveEncoder(com.qualcomm.robotcore.hardware.DcMotor motorType) {
    com.qualcomm.robotcore.hardware.DcMotor.RunMode runMode = this.wheelController.getMotorMode(motorType.getPortNumber());
    if (motorType != null) {
        motorType.setMode(runMode.RESET_ENCODERS);
    }
}