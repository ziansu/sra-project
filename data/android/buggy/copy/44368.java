@java.lang.Override
public void onDataLoaded(java.util.ArrayList<com.tk_squared.varmint.tkkStation> stations) {
    progBar.setVisibility(View.GONE);
    displayListView();
    interstitial.asyncLoadNewBanner();
}