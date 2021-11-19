@java.lang.Override
public void doControl() {
    if (checkForNewFootstepStatusPacket()) {
        generateAndSendPathToBall();
    }else {
        us.ihmc.tools.thread.ThreadTools.sleep(10);
    }
}