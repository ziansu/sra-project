public final void removeMotorController(lenzhoundmusher.MotorController controller) {
    controller.shutdown();
    removePanel(controller.motorPanel);
    controllerArray.remove(controller);
}