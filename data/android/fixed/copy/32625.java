@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    doFirst();
    setContentView(mContentView);
    findViews();
    mRes = getApplicationContext().getResources();
    doCreate(savedInstanceState);
}