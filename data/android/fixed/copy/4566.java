void loginViaVirdi() {
    sensor = new com.dmrr.asistenciasx.VirdiFingerPrintSensor();
    sensor.preparaEngine(profesorList);
    sensor.esperaPorHuella(canvas, jTextArea1, this);
}