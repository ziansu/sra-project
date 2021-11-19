public void setChestAngularControlOnly() {
    boolean[] controlledPositionAxes = new boolean[]{ false , false , false };
    boolean[] controlledOrientationAxes = new boolean[]{ true , true , true };
    setChestControlledAxes(controlledPositionAxes, controlledOrientationAxes);
}