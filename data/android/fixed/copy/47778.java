@org.springframework.transaction.annotation.Transactional(rollbackFor = java.lang.Exception.class)
public void run() {
    storeTrainSchedule();
    storeTrainStop();
}