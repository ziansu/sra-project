public static java.lang.String calcFingerprint(java.security.cert.Certificate cert) {
    try {
        return org.fdroid.fdroid.Utils.calcFingerprint(cert.getEncoded());
    } catch (java.security.cert.CertificateEncodingException e) {
        return null;
    }
}