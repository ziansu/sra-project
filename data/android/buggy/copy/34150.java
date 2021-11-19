public void validateTemplate() {
    for (org.springframework.integration.twitter.core.Tweet tweet : this.twitterTemplate.search("nicaragua").getTweets()) {
    }
}