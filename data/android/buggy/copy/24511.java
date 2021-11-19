@java.lang.Override
public void run() {
    getTweetsTimeline(mUser.id, Util.PROFILETIMELINECOUNT, 0, mPreviousLastTweet.id);
}