@javax.annotation.Nullable
public java.lang.Integer getNodeIdForElement(java.lang.Object element) {
    verifyThreadAccess();
    return mObjectIdMapper.getIdForObject(element);
}