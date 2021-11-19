public void updateTarget(org.altbeacon.beacon.Beacon target) {
    if (target != null) {
        edu.uw.samueldc.assassin_manager.TargetFragment.targetDistance = target.getDistance();
        set(edu.uw.samueldc.assassin_manager.TargetFragment.targetName, edu.uw.samueldc.assassin_manager.TargetFragment.targetDistance);
    }
}