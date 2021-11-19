public static void changeVirtualizerLevel(android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, com.fesskiev.player.services.PlaybackService.class);
    intent.setAction(com.fesskiev.player.services.PlaybackService.ACTION_PLAYBACK_VIRTUALIZER_LEVEL);
    context.startService(intent);
}