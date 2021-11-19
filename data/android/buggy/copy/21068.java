@java.lang.Override
public com.hska.localgram.model.Comment addComment(com.hska.localgram.model.Comment comment) {
    getCurrentSession().save(comment);
    return getCommentByMessage(comment.getMessage());
}