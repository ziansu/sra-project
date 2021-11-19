public static void scheduleNextFromIoQueue() {
    PCB next = os.ioQueue.peek();
    if (next != null) {
        java.lang.System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz schduled cpu to do io");
        if (!(os.isDiskBusy)) {
            os.isDiskBusy = true;
            sos.siodisk(next.jobNumber);
        }
    }
}