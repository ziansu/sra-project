public java.util.List getList() {
    synchronized(lock_) {
        refreshNoLocking();
        doSortCheckedList(checkedList_);
        return readOnlyView_;
    }
}