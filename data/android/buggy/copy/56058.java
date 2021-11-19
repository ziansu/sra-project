public void onSend() {
    android.content.Intent dmIntent = new android.content.Intent(YYCommand.ANSWER_MACHINE_GDMS);
    dmIntent.putExtra("data", "2");
    main_activity.sendBroadcast(dmIntent);
    android.util.Log.v("cconn", "requestOutgoingIsUseDefaultMessage send");
}