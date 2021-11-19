@java.lang.Override
public void onClick() {
    de.greenrobot.event.EventBus.getDefault().post(new com.osc.tweet.events.ShowTweetCommentListEvent(item));
}