public static boolean checkForRIFF(byte[] data) {
    return de.marcreichelt.webp_backport.FileSignatureChecker.byteArrayStartsWith(data, new byte[]{ 82 , 73 , 70 , 70 });
}