@java.lang.Override
public java.lang.Character getArchived() {
    org.broadleafcommerce.common.persistence.ArchiveStatus temp;
    if ((archiveStatus) == null) {
        temp = new org.broadleafcommerce.common.persistence.ArchiveStatus();
    }else {
        temp = archiveStatus;
    }
    return temp.getArchived();
}