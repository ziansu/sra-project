@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    onHandleExtras(savedInstanceState, getIntent().getExtras());
    onLoadContent(savedInstanceState);
    onLoadModules(savedInstanceState);
}