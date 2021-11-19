public static synchronized boolean isProgramBusy() {
    if ((local.tester.Tester.testerState) == (ProgramState.BUSY))
        return true;
    
    return false;
}