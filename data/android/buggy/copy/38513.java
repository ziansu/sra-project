public void addController(IController controller) {
    controller.setMotionManager(_motionManager);
    controller.setSensorManager(_sensorManager);
    controller.init();
    _controller.put(controller.getClass().getName(), controller);
}