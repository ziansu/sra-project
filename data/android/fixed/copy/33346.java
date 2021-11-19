public void onClick(android.content.DialogInterface dialog, int id) {
    com.example.mango.focustime.util.PreferenceUtilities.setForceQuit(mContext, false);
    android.content.Intent intent = new android.content.Intent(mContext, com.example.mango.focustime.Activity.PunishmentActivity.class);
    mContext.startActivity(intent);
}