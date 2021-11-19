public static java.lang.String calcFingerprint(java.security.cert.Certificate cert) {
    if (cert == null)
        return null;
    
    try {
        return org.fdroid.fdroid.Utils.calcFingerprint(cert.getEncoded());
    } catch (java.security.cert.CertificateEncodingException e) {
        return null;
    }
}