private void publishAudit(co.cask.cdap.proto.Id.DatasetInstance datasetInstanceId, co.cask.cdap.data2.metadata.lineage.AccessType accessType) {
    co.cask.cdap.proto.Id.Run programRunId = programContext.getRun();
    if (programRunId != null) {
        co.cask.cdap.data2.audit.AuditPublishers.publishAccess(auditPublisher, datasetInstanceId, accessType, programRunId);
    }
}