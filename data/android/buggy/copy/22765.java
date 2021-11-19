private void createTestedCommentNumberTwo() {
    testedCommentNumberTwo.setComment("bonus");
    testedCommentNumberTwo.setTask(testedTask);
    testedCommentNumberTwo.setUser(testedUser);
    commentServices.addCommentToDatabase(testedCommentNumberTwo);
}