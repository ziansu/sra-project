@java.lang.Override
public void onDeleteCommentSuccess(com.liferay.mobile.screens.models.CommentEntry commentEntry) {
    refreshView();
    getCommentListScreenlet().onDeleteCommentSuccess(commentEntry);
}