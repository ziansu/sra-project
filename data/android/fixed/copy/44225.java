@java.lang.Override
public long findMaxTweetId(java.lang.String tag) {
    java.lang.Long result = tweetRepository.selectMaxId();
    return result == null ? 0 : result;
}