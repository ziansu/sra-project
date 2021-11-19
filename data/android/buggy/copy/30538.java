@java.lang.Override
public boolean ack() {
    if ((store.poll(currentMessageIndex)) != null) {
        return true;
    }else {
        return false;
    }
}