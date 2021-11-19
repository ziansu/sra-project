public void addSurvey(org.eyeseetea.malariacare.data.database.model.Survey survey) {
    for (org.eyeseetea.malariacare.presentation.factory.monitor.MonitorRowBuilder rowBuilder : rowBuilders) {
        rowBuilder.addSurvey(survey);
    }
}