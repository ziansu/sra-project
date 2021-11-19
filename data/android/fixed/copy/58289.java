@gr.iti.mklab.reveal.web.RequestMapping(value = "/crawls/add", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
@gr.iti.mklab.reveal.web.ResponseBody
public gr.iti.mklab.reveal.crawler.CrawlRequest submitCrawlingJob(@gr.iti.mklab.reveal.web.RequestBody
gr.iti.mklab.reveal.web.Requests.CrawlPostRequest request) {
    java.lang.String rootCrawlerDir = "/home/iti-310/VisualIndex/data/";
    return crawlerCtrler.submit(request.isNew, (rootCrawlerDir + (request.collectionName)), request.collectionName, request.keywords);
}