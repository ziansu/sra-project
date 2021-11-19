@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if (savedInstanceState != null) {
        checkBoxSetTime.setChecked(savedInstanceState.getBoolean("IsCheckedBox"));
    }
}