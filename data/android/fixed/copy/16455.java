@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(this, list_productName.get(position).toString(), Toast.LENGTH_LONG).show();
}