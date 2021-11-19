@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        handleIntent(getIntent());
    }
}