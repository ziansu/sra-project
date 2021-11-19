private static byte[] unchunkAllData(boolean gzipped) throws java.io.IOException {
    byte[] rawdata = com.antest1.kcanotify.KcaUtils.unchunkdata(com.antest1.kcanotify.KcaVpnData.responseData);
    if (gzipped)
        rawdata = com.antest1.kcanotify.KcaUtils.gzipdecompress(rawdata);
    
    return rawdata;
}