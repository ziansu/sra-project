public void revok(com.kii.cloud.model.storage.KiiAcl.BucketAction action, com.kii.cloud.model.storage.KiiAcl.Subject subject) throws com.kii.cloud.KiiRestException {
    super.grant(action, subject);
}