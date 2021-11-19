public void setLastSequenceNumber(org.imixs.workflow.ItemCollection aworkitem, long aNewID) throws java.lang.Exception {
    org.imixs.workflow.ItemCollection sequenceNumberObject = loadParentWorkitem(aworkitem);
    sequenceNumberObject.replaceItemValue(org.imixs.marty.ejb.SequenceService.SEQUENCE_NAME, new java.lang.Long(aNewID));
    documentService.save(sequenceNumberObject);
}