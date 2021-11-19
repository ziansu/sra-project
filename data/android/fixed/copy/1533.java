@java.lang.Override
public io.engineblock.activityapi.ActionDispenser getActionDispenser(io.engineblock.activities.csv.FileActivity activity) {
    return new io.engineblock.activities.csv.FileActionDispenser(activity);
}