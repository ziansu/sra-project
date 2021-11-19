@java.lang.Override
public void accept(tollbooth.LogMessage message) {
    this.logMessageQueue.add(message);
}