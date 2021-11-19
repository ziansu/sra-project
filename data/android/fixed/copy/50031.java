@java.lang.Override
public void autonomousPeriodic() {
    if ((activeMission) != null) {
        if (activeMission.run()) {
            java.lang.System.out.println((("Mission " + (activeMission.getName())) + " Complete"));
            activeMission = null;
        }
    }
}