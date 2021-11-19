public static void setSearchWords(java.util.List<java.lang.String> searchWords) {
    if ((com.abc.crawler.AbstractCrawler.searchWords) != null)
        searchWords.clear();
    
    com.abc.crawler.AbstractCrawler.searchWords = searchWords;
    com.abc.crawler.AbstractCrawler.searchWordsStr = com.abc.util.Util.glueSearchWords(searchWords);
}