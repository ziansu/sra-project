private static void startServiceUiWarning(android.content.Context context) {
    context.startService(new android.content.Intent(context, duongmh3.bittrexmanager.service.WarningChatHeadService.class));
}