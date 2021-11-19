private java.util.ArrayList<simpledb.TransactionId> getSharedLockList(simpledb.PageId pageId) {
    java.util.ArrayList<simpledb.TransactionId> arrTran = sharedLocks.get(pageId);
    if (arrTran == null)
        arrTran = new java.util.ArrayList<simpledb.TransactionId>();
    
    return arrTran;
}