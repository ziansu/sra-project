public static void zipWhileCalculatingChecksum(java.util.Map<java.lang.String, org.roda_project.commons_ip.utils.ZipEntryInfo> files, java.io.OutputStream out, org.roda_project.commons_ip.model.SIP sip) throws java.io.IOException, java.lang.InterruptedException, org.roda_project.commons_ip.utils.IPException {
    org.roda_project.commons_ip.utils.ZIPUtils.zip(files, out, sip, true);
}