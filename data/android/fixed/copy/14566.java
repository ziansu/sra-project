public java.lang.String getInformationByXpath(org.jsoup.nodes.Document doc, java.lang.String xpath) {
    if (xpath == null) {
        return null;
    }
    java.lang.String result = us.codecraft.xsoup.Xsoup.compile(xpath).evaluate(doc).get();
    return result;
}