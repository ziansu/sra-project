@java.lang.Override
public void conComplete() {
    pmdisk.deregisterObject(savedmemory);
    cleanUpIntermediateData();
    resumeTasks();
}