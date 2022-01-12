private void init() {
    cond = new configuration.parameters.ConditionalParameter(useImageCalibration);
    cond.setAction(false, new configuration.parameters.Parameter[]{ scaleZ }, false);
}