public int getNodeIdForElement(java.lang.Object element) {
    verifyThreadAccess();
    return mObjectIdMapper.getIdForObject(element);
}