@java.lang.Override
protected void onDestroy() {
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    cn.edu.jxnu.awesome_campus.support.utils.common.PollingUtils.stopPollingService(this, cn.edu.jxnu.awesome_campus.support.service.NotifyService.class, NotifyService.ACTION);
    com.tendcloud.tenddata.TCAgent.onPageEnd(InitApp.AppContext, cn.edu.jxnu.awesome_campus.MainActivity.TAG);
    super.onDestroy();
}