@org.springframework.transaction.annotation.Transactional(readOnly = false)
public void saveEiSampleCheckResult(com.gtm.aeims.model.EiSampleCheckResult result) {
    java.util.Date now = new java.util.Date();
    result.setCreatedate(now);
    result.setScDate(now);
    java.lang.System.out.println("aaa");
    eiSampleCheckResultDao.save(result);
}