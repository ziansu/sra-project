@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    nl.mpcjanssen.simpletask.TodoApplication app = ((nl.mpcjanssen.simpletask.TodoApplication) (getApplication()));
    setTheme(app.getActiveTheme());
    setTheme(app.getActiveFont());
    super.onCreate(savedInstanceState);
}