@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle mArgs = getArguments();
    title = mArgs.getString("dialog_title");
    uri = mArgs.getString("uri");
}