public static boolean isPPTX(java.io.InputStream is) {
    try {
        new org.apache.poi.xslf.usermodel.XMLSlideShow(is);
        return true;
    } catch (java.lang.Exception e) {
        return false;
    }
}