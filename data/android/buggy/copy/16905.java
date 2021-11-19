public static void stop(android.content.Context context) {
    tranquvis.simplesmsremote.Services.SmsReceiver.SMSReceiverService.setStatus(context, ReceiverStatus.Stopped);
    context.stopService(new android.content.Intent(context, tranquvis.simplesmsremote.Services.SmsReceiver.SMSReceiverService.class));
}