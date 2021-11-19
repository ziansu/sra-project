@java.lang.Override
protected void doEvent(android.app.Activity activity) {
    if (!(net.anei.cadpage.SmsPopupUtils.haveNet(activity)))
        return ;
    
    net.anei.cadpage.donation.DonationManager.instance().refreshStatus(activity);
    closeEvents(activity);
}