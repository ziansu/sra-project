@java.lang.Override
public boolean messagesWaiting() {
    boolean msgWaiting = (messageCount.intValue()) > 0;
    java.lang.System.out.println(("messagesWaiting() = " + msgWaiting));
    return msgWaiting;
}