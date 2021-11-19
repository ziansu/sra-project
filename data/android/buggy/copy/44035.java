@java.lang.Override
public void onResult(java.lang.String result) {
    if (showResult(result)) {
        ((com.group6boun451.learner.CommentListAdapter) (comments.getAdapter())).add(new com.group6boun451.learner.model.Comment(commentContent));
    }
}