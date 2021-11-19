@java.lang.Override
public void onLoaderReset(android.content.Loader<java.util.List<com.bitsorific.findyourthings.models.Item>> loader) {
    android.util.Log.d("Loader", "Loader resetting after data change");
    itemListAdapter.setData(null);
}