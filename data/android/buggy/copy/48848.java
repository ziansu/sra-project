@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mAlarmAutoBegin.duration = (2 * position) + 1;
}