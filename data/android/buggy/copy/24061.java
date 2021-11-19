@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    android.content.Intent mapIntent = new android.content.Intent(this, com.ideal.apps.ici.PlaceActivity.class);
    startActivity(mapIntent);
}