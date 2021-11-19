@java.lang.Override
public void run() {
    android.widget.ArrayAdapter<java.lang.CharSequence> adapter = android.widget.ArrayAdapter.createFromResource(getBaseContext(), R.array.activities, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
}