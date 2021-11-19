@java.lang.Override
public void onResponseReceived(org.rstudio.studio.client.common.crypto.PublicKeyInfo publicKeyInfo) {
    publicKeyInfo_ = publicKeyInfo;
    progressIndicator.onCompleted();
}