public static java.lang.String toString(eu.peppol.as2.MimeMessage mimeMessage) {
    byte[] bytes = eu.peppol.as2.MimeMessageHelper.toBytes(mimeMessage);
    return new java.lang.String(bytes);
}