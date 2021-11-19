private com.facebook.stetho.inspector.elements.Document.ChildEventingList acquireChildEventingList(java.lang.Object parentElement, com.facebook.stetho.inspector.elements.DocumentView documentView) {
    com.facebook.stetho.inspector.elements.Document.ChildEventingList childEventingList = mCachedChildEventingList;
    if (childEventingList == null) {
        childEventingList = new com.facebook.stetho.inspector.elements.Document.ChildEventingList();
    }
    childEventingList.acquire(parentElement, documentView);
    return childEventingList;
}