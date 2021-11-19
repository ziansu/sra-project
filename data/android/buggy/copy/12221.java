private long getLatestTweetIdFromDatabase() {
    ca.owenpeterson.twittegorize.models.Tweet latestTweet = tweetManager.getLatestTweet();
    latestTweetId = latestTweet.getTweetId();
    return latestTweetId;
}