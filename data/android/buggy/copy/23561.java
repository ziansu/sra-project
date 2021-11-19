@java.lang.Override
public void onClick(android.view.View v) {
    locFirst = false;
    run = true;
    sendSMSMessage(getResources().getString(EnumSms.WHERE.getSms()));
    launchSearch();
}