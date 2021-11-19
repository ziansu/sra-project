@java.lang.Override
public void onResume() {
    super.onResume();
    if ((state) != null) {
        restoreState(state);
    }
}