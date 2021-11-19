public void onOK() {
    main_activity.yy_playing_msg_dlg = null;
    main_activity.changeShengDao(true);
    if (main_activity.yy_data_source.getIsUseDefaultMessage()) {
    }else {
    }
    stopPlayMsg();
}