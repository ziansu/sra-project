private twitter4j.Twitter cookTwitterInstance() {
    twitter4j.Twitter twitter = twitter4j.TwitterFactory.getSingleton();
    twitter.setOAuthConsumer(consumerKey, consumerSecretKey);
    return twitter;
}