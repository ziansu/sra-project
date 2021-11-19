@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    spinner = ((android.widget.ProgressBar) (findViewById(R.id.progressBar)));
    open(findViewById(R.id.progressBar));
    StartMenu();
}