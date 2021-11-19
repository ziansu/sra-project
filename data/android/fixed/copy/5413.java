public void setListViewByTodayHot(java.util.List<com.ismth.bean.TodayHotBean> list) {
    todayHotAdapter = new com.ismth.adapter.TodayHotAdapter(getApplicationContext(), list);
    listView.setAdapter(todayHotAdapter);
    list = null;
    todayHotAdapter = null;
}