public void onPrepared(int count) {
    com.example.netlog.service.DbActionService.postEvent(new com.example.netlog.bus.DatabaseEvent(mAction, com.example.netlog.bus.DatabaseEvent.STATE_PREPARED, 0, count, null));
    mCount = count;
}