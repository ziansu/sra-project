public void teleopPeriodic() {
    right.set(xbox.getRawAxis(5));
    left.set((-(xbox.getRawAxis(1))));
}