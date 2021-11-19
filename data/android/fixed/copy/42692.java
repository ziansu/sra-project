private static java.lang.String findElementText(org.jsoup.nodes.Element topElem, org.trec.liveqa.GetYAnswersPropertiesFromQid.ElementPredicate f) {
    org.jsoup.nodes.Element elem = org.trec.liveqa.GetYAnswersPropertiesFromQid.findElement(topElem, f);
    return elem == null ? "" : f.getText(elem);
}