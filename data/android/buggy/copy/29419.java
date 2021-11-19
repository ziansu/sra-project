@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_osm_generator);
    if ((getIntent().getExtras()) != null) {
        extractData(getIntent().getExtras());
    }
}