public void tweetJive(java.lang.String jive) {
    try {
        twitter4j.Status status = co.uk.jiveelection.campaign.twit.TwitHelper.twitter.updateStatus(jive);
        updateLastTweetProperty();
        saveProperties();
    } catch (twitter4j.TwitterException e) {
        e.printStackTrace();
    }
}