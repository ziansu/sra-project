public void switchToHighGear() {
    setProfile(edu.nr.robotics.subsystems.drive.Drive.Gear.HIGH_PROFILE);
    if ((gearSwitcher) != null) {
        gearSwitcher.set(edu.nr.robotics.subsystems.drive.Drive.Gear.HIGH_VALUE);
    }
}