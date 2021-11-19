@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    ((android.widget.TextView) (parent.getSelectedView())).setTextColor(getResources().getColor(R.color.ColorWhite));
}