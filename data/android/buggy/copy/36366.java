public void executeSPICommand() {
    java.lang.System.out.printf(cc2520.info());
    spiData.outputSPI(cc2520.getStatus());
    cc2520.rxtxoff();
}