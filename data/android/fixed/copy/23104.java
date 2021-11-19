public int getPermissionsRequest(int position) {
    if (null != (mTabTitles)) {
        int titleId = mTabTitles.get(position);
        if (titleId == (R.string.tab_title_search_people)) {
            return im.vector.activity.CommonActivityUtils.REQUEST_CODE_PERMISSION_MEMBERS_SEARCH;
        }
    }
    return 0;
}