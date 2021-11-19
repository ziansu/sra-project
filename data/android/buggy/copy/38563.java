public void createCrawlers() {
    pool = new CrawlPool();
    pool.initCrawlers();
    WebCrawler.urlCount = 1;
    WebCrawler.exit = 0;
}