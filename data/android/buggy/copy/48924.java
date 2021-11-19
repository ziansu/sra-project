public static java.lang.String convertBreaksToLineSeparators(java.lang.String pageContent) {
    java.lang.String lineizedContent = pageContent.replaceAll("<br/>", java.lang.System.getProperty("line.separator"));
    return lineizedContent;
}