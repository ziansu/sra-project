@java.lang.Override
public void onDismiss() {
    android.util.Log.v("ondismiss", "dismissing");
    java.lang.String atts = refreshList(finalItemIDs);
    new edu.gatech.cs4911.mintyfresh.HomeScreenActivity.ConnectToDB(current).execute(cl, atts);
}