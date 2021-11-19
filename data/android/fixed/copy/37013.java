@java.lang.Override
public java.lang.Object getMessageNonBlocking() {
    FinalProject.communication.CommTuple receivedCommTuple = receivedObjectQueue.poll();
    if (receivedCommTuple == null)
        return null;
    
    replyConnection = receivedCommTuple.getConnection();
    return receivedCommTuple.getObj();
}