@java.lang.Override
public void onClick(android.view.View v) {
    com.example.maxspahn.studentbnb.TimePickerFragment newFragment = new com.example.maxspahn.studentbnb.TimePickerFragment();
    newFragment.show(getFragmentManager(), "timePicker");
    newFragment.setActivity(initdateButton, true);
}