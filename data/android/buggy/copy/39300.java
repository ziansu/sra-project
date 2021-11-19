@android.support.annotation.NonNull
@java.lang.Override
public java.util.List<jp.kshoji.javax.sound.midi.Receiver> getReceivers() {
    java.util.ArrayList<jp.kshoji.javax.sound.midi.Receiver> receivers = new java.util.ArrayList<>();
    if ((receiver) != null) {
        receivers.add(receiver);
    }
    return java.util.Collections.unmodifiableList(receivers);
}