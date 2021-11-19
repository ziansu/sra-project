java.util.List<qasystem.web.dtos.QuestionDTO> findAllQuestionsByAnswerContainsUserId(java.lang.String id) {
    java.lang.Long lUserId = java.lang.Long.getLong(id);
    return convertListToDTOs(questionRepository.findAllByAnswersContainsUserId(lUserId));
}