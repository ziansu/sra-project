public boolean isSearchInMessagesFragment(int position) {
    if (null != (mTabTitles)) {
        return (R.string.tab_title_search_messages) == (mTabTitles.get(position));
    }
    return false;
}