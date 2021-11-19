@java.lang.Override
public void setPassphrase(org.sufficientlysecure.keychain.util.Passphrase passphrase) {
    mPassphrase.removeFromMemory();
    mPassphrase = passphrase;
}