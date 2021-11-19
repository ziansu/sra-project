@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.event_list);
    displayPrivateEvents();
    client = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
}