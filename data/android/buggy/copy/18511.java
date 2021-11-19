@java.lang.Override
public com.sv.quiz_master.user.model.Question getNextQuestion(com.sv.quiz_master.user.model.QuestionPaper questionPaper, java.lang.Integer currentQuestion) {
    return userRepository.getNextQuestion(questionPaper, currentQuestion);
}