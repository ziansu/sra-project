private fetcher.FetchedPage fetch(java.lang.String url, fetcher.FetchedPage.DeviceType device, org.jsoup.Connection.Method method, java.lang.String referrer) {
    return fetcher.FetchedPage.annotationCall(url, device, method, referrer);
}