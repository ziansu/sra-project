@java.lang.Override
public void handleCombinedAudio(net.dv8tion.jda.core.audio.CombinedAudio combinedAudio) {
    try {
        outputStream.write(combinedAudio.getAudioData(1.0));
    } catch (java.io.IOException e) {
    }
}