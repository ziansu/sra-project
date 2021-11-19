@java.lang.Override
public void transferredResourceDeleted(java.lang.String transferredResourceID) {
    boolean forceCommit = false;
    deleteDocumentFromIndex(RodaConstants.INDEX_TRANSFERRED_RESOURCE, transferredResourceID, (("Error deleting Transferred Resource(id=" + transferredResourceID) + ")"), forceCommit);
}