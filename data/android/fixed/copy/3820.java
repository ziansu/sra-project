@org.springframework.transaction.annotation.Transactional
public org.openforis.collect.model.CollectSurvey createTemporarySurveyFromPublished(java.lang.String uri) {
    return createTemporarySurveyFromPublished(uri, true, true);
}