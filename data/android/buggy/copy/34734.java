@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initGoLib();
    try {
        go.goInterface.GoInterface.Start();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}