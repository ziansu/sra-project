@java.lang.Override
public void onSuccess(java.util.ArrayList<com.codepath.apps.allotweets.model.Tweet> tweets) {
    saveTweets(tweets);
    processTweets(tweets);
}