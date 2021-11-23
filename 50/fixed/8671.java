@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED, rollbackFor = java.lang.Exception.class)
private void addReceiptTrack(org.iabako.server.serviceimpl.user.EnterpriseBalance enterpriseBalance, org.iabako.server.serviceimpl.user.User sessionUser, org.iabako.server.serviceimpl.user.Payment payment) {
    org.iabako.server.serviceimpl.user.EnterpriseTrack track = org.iabako.server.serviceimpl.user.EnterpriseTrack.getFromPayment(sessionUser, payment, EnterpriseTrackType.receiptTrack);
    addPaymentTrack(enterpriseBalance, track);
}