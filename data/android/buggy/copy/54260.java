@java.lang.Override
public void stop() {
    if ((myplayer) != null) {
        try {
            myplayer.stopPlayer();
        } catch (javazoom.jl.decoder.JavaLayerException e) {
            e.printStackTrace();
        }
    }
}