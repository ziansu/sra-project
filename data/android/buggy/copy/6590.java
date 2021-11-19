@java.lang.Override
public void onPause() {
    if ((scrollListener) != null)
        rvList.removeOnScrollListener(scrollListener);
    
    super.onPause();
}