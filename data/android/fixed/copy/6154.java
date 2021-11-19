public static org.sufficientlysecure.keychain.service.input.RequiredInputParcel createRequiredKeyringPassphrase(long masterKeyId) {
    return new org.sufficientlysecure.keychain.service.input.RequiredInputParcel(org.sufficientlysecure.keychain.service.input.RequiredInputParcel.RequiredInputType.PASSPHRASE_KEYRING_UNLOCK, null, null, null, masterKeyId, masterKeyId, null, null);
}