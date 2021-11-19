@java.lang.Override
protected void onStart() {
    super.onStart();
    adapter = new android.widget.ArrayAdapter<com.example.owenm_000.countbook2.Counter>(this, android.R.layout.simple_list_item_1, android.R.id.text1, counters);
    listView.setAdapter(adapter);
    refreshScreen();
    loadFromFile();
}