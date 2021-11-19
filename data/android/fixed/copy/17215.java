public void updateViews(com.darrienglasser.clockwork.AlarmData data) {
    mGridView.invalidateViews();
    ((com.darrienglasser.clockwork.AlarmAdapter) (mGridView.getAdapter())).updateData(data);
}