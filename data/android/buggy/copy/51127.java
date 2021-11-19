private void initKeys() {
    control.GameManager.getIstance().getApplication().getInputManager().addMapping("debug", new com.jme3.input.controls.KeyTrigger(com.jme3.input.KeyInput.KEY_TAB));
    this.inputManager.addListener(actionListener, "debug", "mouse");
}