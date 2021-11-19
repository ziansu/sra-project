@java.lang.Override
public int overrideSpeedLimit(int speedLimit) {
    if (speedLimit <= 0)
        return -1;
    
    this.speedLimit = speedLimit;
    controller.setSpeedLimit(speedLimit);
    return 0;
}