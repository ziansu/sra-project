private java.lang.String generateFileName(java.lang.String url) {
    return (Crawler.docCount.incrementAndGet()) + ".html";
}