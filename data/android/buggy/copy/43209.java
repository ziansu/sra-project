@java.lang.Override
public void onClick(android.view.View v) {
    new com.keshavg.reddit.CommentsAdapter.FetchComments(viewHolder, commentsAdapter, moreRepliesId).execute((((url) + "/") + (moreRepliesId.get(0))));
}