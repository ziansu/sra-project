protected java.lang.String getAnswerColumn(int i) {
    switch (i) {
        case 1 :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_CORRECT_ANSWER;
        case 2 :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_ANSWER_2;
        case 3 :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_ANSWER_3;
        case 4 :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_ANSWER_4;
        default :
            return QuestionHelper.QuestionEntry.COLUMN_NAME_CORRECT_ANSWER;
    }
}