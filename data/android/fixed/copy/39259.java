public java.lang.Long getNewSurveyIndex() {
    io.realm.RealmResults<colector.co.com.collector.model.SurveySave> results = colector.co.com.collector.database.DatabaseHelper.realm.where(colector.co.com.collector.model.SurveySave.class).findAll();
    return (results.size()) + 1L;
}