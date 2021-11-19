@java.lang.Override
public com.threatconnect.sdk.server.response.entity.ApiEntitySingleResponse associateIndicatorFile(java.lang.Integer uniqueId, java.lang.String fileHash, java.lang.String ownerName) throws com.threatconnect.sdk.exception.FailedResponseException, java.io.IOException {
    return indAssocWriter.associateIndicatorAddress(uniqueId, fileHash, ownerName);
}