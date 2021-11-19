@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.view.View view = getView();
    if (view != null) {
        view.invalidate();
    }
}