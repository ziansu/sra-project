public void setListViewByTodayHot(java.util.List<com.ismth.bean.TodayHotBean> list) {
    todayHotAdapter = new com.ismth.adapter.TodayHotAdapter(this.getApplicationContext(), list);
    listView.setAdapter(todayHotAdapter);
    list = null;
    todayHotAdapter = null;
}