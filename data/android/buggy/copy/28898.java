public void run() {
    if (run) {
        sendSMSMessage(getResources().getString(EnumSms.WHERE.getSms()));
        launchSearch();
    }
}