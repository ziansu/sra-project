public synchronized void commitFilePersistence(java.lang.Long fileId) {
    com.google.common.base.Preconditions.checkState(mIdIndex.containsKey(fileId), PreconditionMessage.LINEAGE_NO_OUTPUT_FILE, fileId);
    tachyon.master.lineage.meta.Lineage lineage = mOutputFileIndex.get(fileId);
    lineage.updateOutputFileState(fileId, LineageFileState.PERSISTED);
}