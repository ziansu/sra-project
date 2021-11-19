@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.design.widget.BottomNavigationView navigation = ((android.support.design.widget.BottomNavigationView) (findViewById(R.id.navigation)));
    navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
}