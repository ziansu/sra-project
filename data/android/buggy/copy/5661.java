@java.lang.Override
public void run() {
    midiInputEventListener.onMidiSystemExclusive(sender, systemExclusiveStream.toByteArray());
}