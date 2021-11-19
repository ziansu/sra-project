public static boolean isPPTX(java.io.InputStream is) {
    try {
        return org.apache.poi.xslf.usermodel.XMLSlideShow.hasOOXMLHeader(is);
    } catch (java.io.IOException e) {
        return false;
    }
}