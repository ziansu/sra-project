@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        workoutId = savedInstanceState.getLong("workoutId");
    }
    return inflater.inflate(R.layout.fragment_workout_detail, container, false);
}