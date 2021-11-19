public void queueMarkdownHtmlRequest(java.lang.String markdown) {
    connectionsThreadPool.submit(new com.github.shyykoserhiy.gfm.network.GfmClient.GfmWorker(markdown));
}