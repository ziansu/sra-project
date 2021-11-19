@java.lang.Override
public void visit(edu.uci.ics.crawler4j.crawler.Page page) {
    java.lang.System.out.println(page.getWebURL().getURL());
    if ((page.getStatusCode()) != (com.jamesnetherton.GitBookCrawler.HTTP_OK)) {
        com.jamesnetherton.GitBookCrawler.failedPages.add(page);
    }
}