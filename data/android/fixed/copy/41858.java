public void addDebugPoints(java.util.ArrayList<org.wso2.siddhi.launcher.debug.dto.BreakPointDTO> breakPoints) {
    for (org.wso2.siddhi.launcher.debug.dto.BreakPointDTO breakPoint : breakPoints) {
        setBreakPoint(breakPoint);
    }
}