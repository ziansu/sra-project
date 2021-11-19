public java.util.List<qasystem.web.dtos.AnswerDTO> getAllAnswersByQuestionId(java.lang.String id) {
    java.lang.Long lQuestionId = java.lang.Long.getLong(id);
    return convertListToDTOs(answerRepository.findAllByParentQuestion(lQuestionId));
}