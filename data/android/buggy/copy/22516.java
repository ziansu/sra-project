private java.io.InputStream openRandomAccessInputStream(jcifs.smb.SmbFile file) {
    try {
        return new org.no_ip.zhouzian.mynas.infrastructure.StreamOverHttp.RandomAccessInputStream(file);
    } catch (java.lang.Exception ex) {
        return null;
    }
}