public void setLastSequenceNumber(org.imixs.workflow.ItemCollection aworkitem, int aNewID) throws java.lang.Exception {
    org.imixs.workflow.ItemCollection sequenceNumberObject = loadParentWorkitem(aworkitem);
    sequenceNumberObject.replaceItemValue(org.imixs.marty.ejb.SequenceService.SEQUENCE_NAME, new java.lang.Integer(aNewID));
    documentService.save(sequenceNumberObject);
}