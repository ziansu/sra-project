private java.io.File getProcessedImportDir() {
    if ((com.krishagni.catissueplus.core.importer.services.impl.ImportRecordsTask.processedImportDir) == null) {
        com.krishagni.catissueplus.core.importer.services.impl.ImportRecordsTask.processedImportDir = new java.io.File((((getDataDir()) + (java.io.File.separator)) + "processed-bulk-import"));
    }
    return com.krishagni.catissueplus.core.importer.services.impl.ImportRecordsTask.processedImportDir;
}