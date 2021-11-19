@java.lang.Override
public void beforeRun() throws java.lang.Exception {
    service = getService();
    cache = service.getRecordStore(name, getPartitionId());
}