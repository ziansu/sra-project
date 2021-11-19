@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.appbrain.AppBrain.init(this);
    setContentView(R.layout.activity_main);
    setSupportActionBar(((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar))));
    init();
}