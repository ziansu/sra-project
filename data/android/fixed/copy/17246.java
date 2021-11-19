@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> l, android.view.View v, int position, long id) {
    adapter.changeSelection(v, position);
}