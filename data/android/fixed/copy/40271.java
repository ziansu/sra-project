@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testThatThrowsExceptionIfUrlIsNull() {
    new net.vidageek.crawler.PageCrawler(null, downloader);
}