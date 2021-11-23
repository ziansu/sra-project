@java.lang.Override
public java.lang.String status() {
    return (("Delay: " + (config.getDelay())) + ", next message to be send: ") + (lastMessage);
}