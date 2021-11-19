@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    createActivityModule();
    super.onCreate(savedInstanceState);
    viewInjector.inject(this, onCreateViewId());
    configurationKeeper.create();
}