public void downloadImages(jig.bing.search.ImageResponse response) {
    jig.bing.ImageDownloader imageDownloader = new jig.bing.ImageDownloader();
    imageDownloader.downloadImages(response.getResults());
}