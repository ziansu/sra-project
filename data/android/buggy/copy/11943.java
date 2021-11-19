@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.current_heroes)));
    populateListView();
    testClick();
}