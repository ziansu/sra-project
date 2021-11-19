private void showToday(java.util.List<cc.metapro.openct.data.ClassInfo> infos, int week) {
    mTodayClassAdapter.setNewTodayClassInfos(infos, week);
    mTodayClassAdapter.notifyDataSetChanged();
    cc.metapro.openct.widget.DailyClassWidget.update(this);
}