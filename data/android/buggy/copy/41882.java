private java.util.Set<simpledb.PageId> getLockSet(simpledb.TransactionId tid) {
    java.util.Set<simpledb.PageId> arrPage = relatedPages.get(tid);
    if (arrPage == null)
        arrPage = new java.util.HashSet<simpledb.PageId>();
    
    return arrPage;
}