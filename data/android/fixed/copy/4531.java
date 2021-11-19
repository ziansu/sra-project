public void setProcessingState(final org.holodeckb2b.interfaces.persistency.entities.IMessageUnitEntity msgUnit, final org.holodeckb2b.interfaces.processingmodel.ProcessingState newProcState) throws org.holodeckb2b.interfaces.persistency.PersistenceException {
    this.setProcessingState(msgUnit, null, newProcState);
}