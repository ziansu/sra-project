public static javax.net.ssl.HttpsURLConnection getHttpsURLConnection(java.lang.String urlString) throws java.io.IOException {
    urlString.replaceFirst("^[Hh][Tt][Tt][Pp]:", "https:");
    return info.guardianproject.netcipher.NetCipher.getHttpsURLConnection(new java.net.URL(urlString), false);
}