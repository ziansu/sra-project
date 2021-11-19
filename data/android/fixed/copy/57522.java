@java.lang.Override
public void onDataLoaded(com.dominika.florczykowska.placesfinder.classes.pojo.placesearch.PlaceSearch response) {
    android.util.Log.d(com.dominika.florczykowska.placesfinder.fragments.MapListFragment.TAG, "data loaded");
    getRetrofitResponse(response);
}