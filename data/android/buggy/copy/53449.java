public void goBackHistory() {
    java.lang.String prevHtml = getHistory();
    com.jtmcn.archwiki.viewer.WikiClient.loadWikiHtml(prevHtml);
}