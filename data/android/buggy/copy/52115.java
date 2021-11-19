private java.io.File getProcessedImportDir() {
    if ((com.krishagni.catissueplus.core.importer.services.impl.ImportRecordsTask.processedImportDir) == null) {
        java.lang.String processedImpDirPath = ((getDataDir()) + (java.io.File.separator)) + "processed-bulk-import";
        com.krishagni.catissueplus.core.importer.services.impl.ImportRecordsTask.processedImportDir = new java.io.File(processedImpDirPath);
    }
    return com.krishagni.catissueplus.core.importer.services.impl.ImportRecordsTask.processedImportDir;
}