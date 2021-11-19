public static void main(java.lang.String[] args) throws java.lang.Exception {
    crawler.SubCategoryCrawler subCategoryCrawler = new crawler.SubCategoryCrawler(crawler.CrawlerMain.proxyPath);
    subCategoryCrawler.exploreSubCategoryLinks(crawler.CrawlerMain.categoryUrlPath, crawler.CrawlerMain.subCategoryUrlPath);
}