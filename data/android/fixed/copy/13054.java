private void deletePage() {
    if ((fragmentList.size()) == 0) {
        return ;
    }
    int position = viewPager.getCurrentItem();
    fragmentList.remove(position);
    pagerAdapter.notifyDataSetChanged();
}