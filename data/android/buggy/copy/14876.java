@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.list_view);
    this.setTitle(((mainObject.restarauntName) + " Menu Categories"));
    onDisplayCategoryList();
}