private java.lang.String getQuestionHTML(Question q, int question, int student) {
    if (q instanceof MultipleChoiceQuestion)
        return getMultipleChoiceQuestionHTML(((MultipleChoiceQuestion) (q)), question, student);
    
    return "";
}