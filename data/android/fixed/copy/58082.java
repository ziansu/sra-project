@java.lang.Override
public void run() {
    org.talend.core.model.update.RepositoryUpdateManager.updateMultiSchema(connectionItem, oldMetadataTable, oldTableMap);
    closeLockStrategy();
}