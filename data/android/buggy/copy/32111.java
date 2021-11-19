@java.lang.Override
public java.lang.Character getArchived() {
    if ((archiveStatus) == null) {
        archiveStatus = new org.broadleafcommerce.common.persistence.ArchiveStatus();
    }
    return archiveStatus.getArchived();
}