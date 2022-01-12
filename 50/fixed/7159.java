private java.lang.String getFilePathForZipEntry(org.jboss.windup.graph.model.ArchiveModel archiveModel, java.util.zip.ZipEntry entry) {
    return getFilePathForZipEntry(archiveModel, entry.getName());
}