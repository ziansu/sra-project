@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initGUI();
    initData(savedInstanceState);
    initApplicationLogic();
    initEventToListenerMapping();
}