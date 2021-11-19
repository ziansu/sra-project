public java.lang.String loadResultOfSurvey(long surveyId) {
    this.surveyResult = surveyResultLocal.getSurveyResult(surveyId);
    return initBean();
}