@java.lang.Override
public void onNewMessage(Grasping.BumpMsg message) {
    objDetected = message.gripper;
}