private void checkAckNackCondition() {
    if (((java.lang.System.currentTimeMillis()) - (lastAckNackTimestamp)) > 3)
        sendAckNackResponse();
    
}