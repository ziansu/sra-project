public void addLink(final java.lang.String sourceWikiPageId, final java.lang.String targetWikiPageId) {
    if ((sourceWikiPageId == null) || (targetWikiPageId == null)) {
        return ;
    }
    linksFromPage.put(sourceWikiPageId, targetWikiPageId);
    linksToPage.put(targetWikiPageId, sourceWikiPageId);
}