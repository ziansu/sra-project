@java.lang.Override
public synchronized void setSteerValue(int value) {
    currentSteerValue = constrainInVCURange(value);
    sendValuesToCar();
}