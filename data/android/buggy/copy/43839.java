@java.lang.Override
protected void execute() {
    this.getOperatorDisplay().setNumericFieldValue(OperatorDisplay.DISTANCE_FIELD_NAME, rightEncoder.getDistance());
}