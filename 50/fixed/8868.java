@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((dataSource) == null) {
        dataSource = MainActivity.dataSource;
        dataSource.deleteAllThrows();
        addDemoThrows();
    }
}