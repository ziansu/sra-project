public void switchToHighGear() {
    if ((getCurrentGear()) != (edu.nr.robotics.subsystems.drive.Drive.Gear.high)) {
        setProfile(edu.nr.robotics.subsystems.drive.Drive.Gear.HIGH_PROFILE);
        if ((gearSwitcher) != null) {
            gearSwitcher.set(edu.nr.robotics.subsystems.drive.Drive.Gear.HIGH_VALUE);
        }
    }
}