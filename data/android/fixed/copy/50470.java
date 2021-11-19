private org.xcolab.client.comment.pojo.Comment getTargetComment() {
    try {
        return org.xcolab.client.comment.CommentClient.getComment(report.getTargetId(), true);
    } catch (org.xcolab.client.comment.exceptions.CommentNotFoundException e) {
        return null;
    }
}