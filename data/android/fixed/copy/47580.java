@java.lang.Override
public void run() {
    databaseOpenHelper = new com.ngynstvn.android.blocspot.api.model.database.DatabaseOpenHelper(com.ngynstvn.android.blocspot.BlocspotApplication.getSharedInstance(), poiTable);
}