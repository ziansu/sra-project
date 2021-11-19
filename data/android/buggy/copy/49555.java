public void stopTemporarily() {
    nl.verheulconsultants.monitorisp.service.ISPController.controllerDownTimeStamp = java.lang.System.currentTimeMillis();
    stop = true;
}