private void validate(org.zstack.storage.primary.nfs.APIAddNfsPrimaryStorageMsg msg) {
    org.zstack.header.errorcode.ErrorCode err = new org.zstack.storage.primary.nfs.NfsApiParamChecker().checkUrl(msg.getZoneUuid(), msg.getUrl());
    if (err != null) {
        throw new org.zstack.header.apimediator.ApiMessageInterceptionException(err);
    }
}