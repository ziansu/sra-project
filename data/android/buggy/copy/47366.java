@java.lang.Override
public void onActivityCreated(android.os.Bundle state) {
    super.onActivityCreated(state);
    setUpState(state);
    setUpBindings();
    setUpRefreshing();
    setUpMetrics();
}