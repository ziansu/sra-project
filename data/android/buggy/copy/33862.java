public static byte[] createKey(byte[] passphrase, byte[] inputsalt) throws filetitok.crypto.CryptoException {
    return inputsalt == null ? filetitok.crypto.KeyDerivation.deriveKey(passphrase) : filetitok.crypto.KeyDerivation.createKey(passphrase, inputsalt);
}