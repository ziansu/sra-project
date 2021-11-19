@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    controller = new com.app.dimbo.simplecalculator.Controller(this);
    bindViewControls();
    initHistoryView();
}