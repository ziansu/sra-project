@java.lang.Override
public void deleteByCommentIds(java.util.List<java.lang.Long> commentIds) {
    log.debug("deleteCommentVoteByCommentId() - commentIds = {}", commentIds);
    if (!(commentIds.isEmpty())) {
        commentVoteRepository.deleteByCommentId(commentIds);
    }
}