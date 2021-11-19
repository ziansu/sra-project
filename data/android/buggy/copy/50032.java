public void persist(@lombok.NonNull
za.ac.wits.cpd.service.bigdatavisual.Tweet tweet) {
    log.log(java.util.logging.Level.SEVERE, "##### persisting {0}", tweet.toString());
    persistTweet(tweet);
}