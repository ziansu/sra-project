@java.lang.Override
protected boolean doProcedureUpdate() throws java.lang.Exception {
    boolean allDone = true;
    for (org.team5940.robot_core.modules.control.procedures.ProcedureModule p : this.procedures.values())
        allDone = allDone && (p.updateProcedure());
    
    return false;
}