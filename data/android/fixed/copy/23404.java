private void showExerciseFragment() {
    exercise_frag = new com.example.kaveon14.workoutbuddy.Fragments.MainFragments.ExerciseFragment();
    exercise_frag.setMenu(menu);
    exercise_frag.setMainActivity(mainActivity);
    addFragmentToStack(getActiveFragment(), exercise_frag, R.id.exercise_fragment);
}