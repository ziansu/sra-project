private void addNewSubWorkoutOnClick() {
    java.lang.String subWorkoutName = getSubWorkoutName();
    addSubWorkoutToDatatable(subWorkoutName);
    subWorkoutNames.add(subWorkoutName);
    adapter.notifyDataSetChanged();
    (SUBWORKOUT_DAY)++;
}