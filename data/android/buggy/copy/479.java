public void shiftToHighGearMotion() {
    if (!(isHighGear)) {
        m_solenoidshift.set(false);
        TorCAN.INSTANCE.chooseVelocityControl();
        isHighGear = true;
        TorMotionProfile.INSTANCE.joystickTraj.execute();
        TorMotionProfile.INSTANCE.setActive();
    }
}