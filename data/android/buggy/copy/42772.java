@java.lang.Override
public void onLoadMore() {
    android.util.Log.i(ru.kuchanov.tproger.fragment.FragmentCategory.LOG, "OnLoadMore called!");
    (currentPageToLoad)++;
    performRequest(currentPageToLoad, false);
}