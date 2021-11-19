private void _generateTabs(int index) {
    contentHomeAdapter = new com.qi.xiaohui.dingdang.adapter.ContentHomeAdapter(getSupportFragmentManager(), dataStore.getMenus().get(index).getCategory());
    viewPager.setAdapter(contentHomeAdapter);
    tabLayout.setupWithViewPager(viewPager);
}