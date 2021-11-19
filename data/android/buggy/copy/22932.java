@java.lang.Override
public void onClick(android.view.View v) {
    db.readCSV(getApplicationContext(), R.raw.stats_6);
    db.deleteDuplicates();
    db.logClicks();
}