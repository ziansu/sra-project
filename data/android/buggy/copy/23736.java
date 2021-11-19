@java.lang.Override
public boolean isGoalChanged(nu.yona.server.goals.entities.Goal existingGoal) {
    return !(java.util.Arrays.equals(zones, ((nu.yona.server.goals.entities.TimeZoneGoal) (existingGoal)).getZones()));
}