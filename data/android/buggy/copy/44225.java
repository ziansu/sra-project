@java.lang.Override
public long findMaxTweetId(java.lang.String tag) {
    return tweetRepository.selectMaxId();
}