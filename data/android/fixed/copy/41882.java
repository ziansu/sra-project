private java.util.Set<simpledb.PageId> getLockSet(simpledb.TransactionId tid) {
    if ((relatedPages.get(tid)) == null)
        relatedPages.put(tid, new java.util.HashSet<simpledb.PageId>());
    
    return relatedPages.get(tid);
}