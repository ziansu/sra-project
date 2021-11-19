@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_selected_route);
    this.selectedRoute = ((com.pmanager.humbertolinero.pmanager.HelperClasses.route) (getIntent().getSerializableExtra("selectedRoute")));
    android.util.Log.d("Sche", "Activity Created");
}