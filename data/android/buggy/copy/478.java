@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    tcBaseDelegate.onCreate(this, savedInstanceState);
    try {
        app = getBaseApplicationInterface();
    } catch (java.lang.Exception e) {
    }
    app.addActivity(this);
}