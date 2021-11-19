public static byte[] certifierJwtSecret() {
    return org.fenixedu.bennu.RegistrationProcessConfiguration.getConfiguration().signerJwtSecret().getBytes();
}