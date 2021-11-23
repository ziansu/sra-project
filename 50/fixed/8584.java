@java.lang.Override
public tollbooth.LogMessage getNextMessage() {
    if (logMessageQueue.isEmpty()) {
        return null;
    }else {
        return logMessageQueue.poll();
    }
}