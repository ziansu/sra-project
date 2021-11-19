public synchronized void processMasterComputationalMessage(pt.ulisboa.tecnico.hourglass.slave.MasterComputationalMessage masterComputationalMessage) {
    java.lang.System.out.println(("[INFO] MASTER COMPUTATIONAL MESSAGE REEIVED IS LAST: " + (masterComputationalMessage.isLastSuperstep())));
    this.incrementalComputationTerminated = masterComputationalMessage.isLastSuperstep();
    this.receivedMasterComputationalMessage = true;
    this.notify();
}