@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    de.dhbw_loerrach.laju.Receiver receiver = new de.dhbw_loerrach.laju.Receiver(this);
    receiver.fillEvents();
}