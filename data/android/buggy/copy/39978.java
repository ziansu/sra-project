@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.Toast.makeText(this, vno[position], Toast.LENGTH_SHORT).show();
    viewCode(vno[position]);
}