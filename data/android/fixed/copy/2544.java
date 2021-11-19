public static byte[] certifierJwtSecret() {
    return org.fenixedu.bennu.RegistrationProcessConfiguration.getConfiguration().certifierJwtSecret().getBytes();
}