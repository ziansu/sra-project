public void onclick_exit(android.view.View view) {
    android.content.Intent i = new android.content.Intent(this, info.androidhive.materialtabs.activity.MapsActivity.class);
    i.putExtra("EnterOrExit", "Exit");
    myDB.close();
    startActivity(i);
}