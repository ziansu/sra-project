@java.lang.Override
public java.lang.String status() {
    return (((("Delay: " + (config.getDelay())) + ", next execution: ") + (messenger.getNextExecutionTime())) + ", next message to be send: ") + (lastMessage);
}