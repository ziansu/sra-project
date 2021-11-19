protected static void sendMsg(java.lang.String number, java.lang.String message) {
    if (number != null) {
        android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault();
        smsManager.sendTextMessage(number, null, message, null, null);
    }
}