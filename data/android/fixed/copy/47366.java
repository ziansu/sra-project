@java.lang.Override
public void onActivityCreated(android.os.Bundle state) {
    super.onActivityCreated(state);
    setUpBindings();
    setUpRefreshing();
    setUpMetrics();
    setUpState(state);
}