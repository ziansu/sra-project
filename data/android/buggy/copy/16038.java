@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mNote.setTaskDone(buttonView.isChecked());
    updateData();
}