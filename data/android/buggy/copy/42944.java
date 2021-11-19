public boolean queriedObjectAtIndexHasInstanceId(int index, long instanceId) {
    org.ccsds.moims.mo.com.archive.structures.ArchiveDetails archiveDetails = ((org.ccsds.moims.mo.com.archive.structures.ArchiveDetails) (queriedArchiveDetailsList.get(index)));
    return (archiveDetails.getInstId().longValue()) == instanceId;
}