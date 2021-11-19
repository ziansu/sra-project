@java.lang.Override
public void handleSetChangeNotify(int pin, boolean changeNotify) {
    logMethod("handleSetChangeNotify", pin, changeNotify);
    if (changeNotify) {
        intputPinStates_[pin].openNextListener();
    }else {
        intputPinStates_[pin].closeCurrentListener();
    }
}