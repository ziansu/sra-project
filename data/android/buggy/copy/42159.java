@java.lang.Override
public void onClick(android.view.View v) {
    de.greenrobot.event.EventBus.getDefault().post(new com.osc.tweet.events.ShowTweetCommentListEvent(item));
}