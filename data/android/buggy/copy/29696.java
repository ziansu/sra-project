public void onOK() {
    main_activity.yy_playing_msg_dlg = null;
    main_activity.yy_auto_save_listener = null;
    main_activity.changeShengDao(true);
    stopPlayMsg(true, true);
}