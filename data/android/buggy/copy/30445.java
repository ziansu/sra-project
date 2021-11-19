@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maps);
    com.bfbstudio.routetracking.UI.MapsFragment fragmentMap = new com.bfbstudio.routetracking.UI.MapsFragment();
    getSupportFragmentManager().beginTransaction().add(R.id.Fragment_Map, fragmentMap).commit();
}