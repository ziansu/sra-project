public edu.pitt.dbmi.ccd.db.entity.JobQueueInfo findFirstJobInQueue() {
    return jobQueueInfoRepository.findByStatus(new java.lang.Integer(0)).get(0);
}