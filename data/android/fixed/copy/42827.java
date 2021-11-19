@org.springframework.transaction.annotation.Transactional(readOnly = false)
public void saveEiSampleCheckResult(com.gtm.aeims.model.EiSampleCheckResult result) {
    java.util.Date now = new java.util.Date();
    result.setCreatedate(now);
    result.setScDate(now);
    eiSampleCheckResultDao.save(result);
}