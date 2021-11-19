@java.lang.Override
public java.util.List<org.openmrs.module.pregnancycdss.DiseasesSymptOptModel> getDiseasesSymptOptBySymptoptId(java.lang.Integer selectedSymptOptId) {
    java.lang.System.out.println("semteacher: 25000. Calling dao from service...geting all diseases by symptom options");
    log.debug("semteacher: 25000. Calling dao from service...geting all diseases by symptom options");
    return getDao().getDiseasesSymptOptBySymptoptId(selectedSymptOptId);
}