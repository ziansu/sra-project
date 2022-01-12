@java.lang.Override
public void controlChange(javax.sound.midi.ShortMessage message) {
    if (_sequencer.isRunning()) {
        switch (message.getCommand()) {
            case 128 :
            case 144 :
                notifyPosition(_sequencer.getTickPosition());
                break;
        }
    }
}