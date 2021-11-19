private void updateGlobalStatistics(com.example.murk.kwizgeeq.model.UserQuiz quiz) {
    quiz.getCurrentTempStatistics().mergeInto(globalStatistics);
    quiz.resetCurrentTempStatistics();
    EventBusWrapper.BUS.post(this);
    saveStatisticsDataToDatabase();
}