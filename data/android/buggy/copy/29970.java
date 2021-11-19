public static void changeVirtualizerLevel(android.content.Context context, int level) {
    android.content.Intent intent = new android.content.Intent(context, com.fesskiev.player.services.PlaybackService.class);
    intent.setAction(com.fesskiev.player.services.PlaybackService.ACTION_PLAYBACK_VIRTUALIZER_LEVEL);
    intent.putExtra(com.fesskiev.player.services.PlaybackService.PLAYBACK_EXTRA_BASS_BOOST_LEVEL, level);
    context.startService(intent);
}