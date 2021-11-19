@java.lang.Override
public void onSubmit(com.changhong.common.utils.DialogUtil.DialogMessage dialogMessage) {
    com.changhong.common.service.ClientSendCommandService.titletxt = "未连接";
    com.changhong.tvhelper.activity.TVHelperMainActivity.title.setText(ClientSendCommandService.titletxt);
    com.changhong.tvhelper.activity.TVHelperMainActivity.mhandler.sendEmptyMessage(2);
    if ((dialogMessage.dialog) != null) {
        dialogMessage.dialog.dismiss();
    }
}