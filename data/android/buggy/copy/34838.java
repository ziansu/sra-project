private void searchNear(java.lang.String content) {
    isNearLayoutShow = false;
    layoutNearAdvice.setVisibility(View.GONE);
    pageIndex = 0;
    startSearchPlace(content, nowLatLng, true, false);
}