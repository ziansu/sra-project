@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    app.mapquest.com.mapquest.api.Getting.syncLocalDatastoreWithServer();
}