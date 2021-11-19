private void initInstances() {
    daoManager = new com.ssru.mrsmile.apptest.manager.BloggerDaoManager();
    listAdapter = new com.ssru.mrsmile.apptest.adapter.BloggerListAdapter();
    listView.setAdapter(listAdapter);
}