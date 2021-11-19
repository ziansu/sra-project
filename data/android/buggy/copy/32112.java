@java.lang.Override
public void toggle() {
    if (super.getState()) {
        toOtherState();
    }else {
        toEntryState();
    }
    super.toggle();
}