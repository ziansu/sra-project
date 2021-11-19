@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getViewBinder()) != null) {
        getViewBinder().clearAllBindings();
    }
}