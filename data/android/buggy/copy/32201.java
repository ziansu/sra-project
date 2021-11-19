@java.lang.Override
public boolean deleteQuestion(ua.kpi.nc.persistence.model.FormQuestion formQuestion) {
    return (formQuestionDao.deleteFormQuestion(formQuestion)) != 0;
}