@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.util.Log.d(com.jtquang.raven.MapViewActivity.TAG, "DialogInterface.OnClickListener:onClick");
    if (((mSelectedRadius) != 0) && ((mGeoQuery) != null)) {
        mGeoQuery.setRadius(mSelectedRadius);
    }
}