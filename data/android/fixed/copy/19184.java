public java.util.List<qasystem.web.dtos.AnswerDTO> getAllAnswersByQuestionId(java.lang.String id) {
    java.lang.Long lQuestionId = java.lang.Long.parseLong(id);
    return convertListToDTOs(answerRepository.findAllByParentQuestion(lQuestionId));
}