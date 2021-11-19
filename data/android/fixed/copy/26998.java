@java.lang.Override
public void followSpeed() {
    referenceSpeed += step;
    if ((referenceSpeed) <= 0) {
        referenceSpeed = 0;
    }
    enforceSpeedLimit();
}