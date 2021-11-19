protected void finalize() {
    application.QueryController.controllerHashMap.remove("controllerID");
    application.QueryController.controllerHashMap.remove(controllerID);
}