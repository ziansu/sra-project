@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.widget.Toast.makeText(view.getContext(), ("Long clicked position: " + i), Toast.LENGTH_SHORT).show();
    return true;
}