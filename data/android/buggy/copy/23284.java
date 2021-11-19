public void execute() {
    workdone = ((duration)--) == 0;
    if (workdone) {
        rmx.ppp.G.state = rmx.ppp.C.STATE_SUCCESS;
        java.lang.System.out.println("End ...");
    }else
        java.lang.System.out.println("Still working ...");
    
}