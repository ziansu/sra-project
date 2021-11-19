public long getSmppRequestsProcessedById(java.lang.Integer id) {
    if ((smppBalancerRunner) != null)
        return smppBalancerRunner.getSmppRequestsProcessedById(id);
    else
        return 0;
    
}