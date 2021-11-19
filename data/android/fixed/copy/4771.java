@java.lang.Override
public java.lang.String updateUserQuestion(java.lang.String questionId, java.lang.String userId) {
    com.discussion.portal.mongodb.model.DbUser user = getUserByUserId(userId);
    user.addQuestionId(questionId);
    userRepository.save(user);
    return "Successfully added question";
}