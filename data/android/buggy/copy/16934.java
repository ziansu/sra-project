@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getBaseContext(), de.androidnewcomer.pendlerwecker.Geo_Service.class);
    startService(intent);
    android.util.Log.d("Log", "hier1");
}