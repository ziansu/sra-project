@java.lang.Override
public void onResume() {
    super.onResume();
    hideSubtitle();
    activityMain.getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    app.setNotEditing();
    checkHeatmapsExist();
}