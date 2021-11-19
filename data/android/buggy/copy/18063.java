public void unmapButton() {
    inputManager.deleteMapping(maud.tools.CameraTool.moveForwardEvent);
    inputManager.deleteMapping(maud.tools.CameraTool.moveBackwardEvent);
    inputManager.deleteMapping(maud.tools.CameraTool.moveDownEvent);
    inputManager.deleteMapping(maud.tools.CameraTool.moveRightEvent);
    inputManager.deleteMapping(maud.tools.CameraTool.moveLeftEvent);
    inputManager.deleteMapping(maud.tools.CameraTool.moveUpEvent);
}