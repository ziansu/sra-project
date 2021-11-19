@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    removeItemFromList(position);
    android.widget.Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();
    return true;
}