public void updateEventOwners() {
    com.example.wojciech.groupon.DbUtils.UpdateDatabaseAsyncTask task = new com.example.wojciech.groupon.DbUtils.UpdateDatabaseAsyncTask(mContext, null);
    task.execute(com.example.wojciech.groupon.DbUtils.UpdateOptions.EVENT_OWNERS);
}