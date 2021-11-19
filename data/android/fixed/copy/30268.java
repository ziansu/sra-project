public static com.kryptnostic.sharing.v1.models.Share fromSharingRequest(com.kryptnostic.directory.v1.models.UserKey user, com.kryptnostic.sharing.v1.models.request.SharingRequest request) {
    return new com.kryptnostic.sharing.v1.models.Share(request.getDocumentId(), request.getEncryptedSharingKey(), request.getUserKeys().get(user));
}