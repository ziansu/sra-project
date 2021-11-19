@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    ((org.wordpress.android.WordPress) (getApplication())).component().inject(this);
    super.onCreate(savedInstanceState);
}