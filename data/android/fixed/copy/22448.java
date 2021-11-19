public void addComment(java.lang.Long arrivalTime, java.lang.Long userID) {
    commenters.add(userID);
    latestCommentTime = arrivalTime;
    score = (score) + 10;
}