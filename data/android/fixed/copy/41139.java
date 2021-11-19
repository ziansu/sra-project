public void updateTodayExerciseList() {
    todayExerciseList.clearExerciseList();
    for (java.lang.String i : com.example.user.bodymanager.Variables.arrayList) {
        todayExerciseList.addExercise(new com.example.user.bodymanager.Exercise(i, 0, null, null, 0, null, null, null, null));
    }
}