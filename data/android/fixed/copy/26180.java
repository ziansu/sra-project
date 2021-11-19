public answer.Answer getAnswer(int studentId) {
    return _answer.duplicateWithoutAnswers(studentId);
}