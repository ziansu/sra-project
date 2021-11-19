public static void scheduleNextFromIoQueue() {
    PCB next = os.ioQueue.peek();
    if (next != null) {
        if (!(os.isDiskBusy)) {
            os.isDiskBusy = true;
            sos.siodisk(next.jobNumber);
        }
    }
}