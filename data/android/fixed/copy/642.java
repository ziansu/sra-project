private void handleNewURL(URLScore urlScore) {
    this.urlScoreQueue.add(urlScore);
    this.urlToURLScoreMap.put(urlScore.getLink().getAbsUrl(), urlScore);
}