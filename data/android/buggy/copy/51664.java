@java.lang.Override
public void openSnippet(int windowOpenDisposition, org.chromium.chrome.browser.ntp.snippets.SnippetArticle article) {
    openUrl(windowOpenDisposition, article.mUrl);
    mSnippetsBridge.onSuggestionOpened(article.mGlobalPosition, article.mCategory, article.mPosition, article.mPublishTimestampMilliseconds, article.mScore, windowOpenDisposition);
    org.chromium.chrome.browser.ntp.NewTabPageUma.monitorContentSuggestionVisit(mTab, article.mCategory);
}