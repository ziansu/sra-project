public static ch.zhaw.bait17.audio_signal_processing_toolbox.player.AudioPlayer getInstance() {
    ch.zhaw.bait17.audio_signal_processing_toolbox.player.AudioPlayer.mp3Decoder = ch.zhaw.bait17.audio_signal_processing_toolbox.player.MP3Decoder.getInstance();
    ch.zhaw.bait17.audio_signal_processing_toolbox.player.AudioPlayer.waveDecoder = ch.zhaw.bait17.audio_signal_processing_toolbox.player.WaveDecoder.getInstance();
    return ch.zhaw.bait17.audio_signal_processing_toolbox.player.AudioPlayer.INSTANCE;
}