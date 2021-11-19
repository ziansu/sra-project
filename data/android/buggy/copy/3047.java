@java.lang.Override
public void setGroupQuota(java.lang.String groupId, java.lang.Long quota, org.xtreemfs.mrc.database.AtomicDBUpdate update) throws org.xtreemfs.mrc.database.DatabaseException {
    assert (groupId != null) && (groupId.isEmpty());
    setOwnerQuotaInfo(groupId, quota, OwnerType.GROUP, QuotaInfo.QUOTA, update);
}