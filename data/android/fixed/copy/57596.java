@java.lang.Override
public void viewWillDisappear(boolean animated) {
    super.viewWillDisappear(animated);
    this.currentPicker.setHidden(true);
}