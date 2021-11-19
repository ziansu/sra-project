@java.lang.Override
public void execute() {
    de.uni_potsdam.hpi.bpt.bp2014.database.DbDataFlow dbDataFlow = new de.uni_potsdam.hpi.bpt.bp2014.database.DbDataFlow();
    if (dbDataFlow.getOutputSetsForControlNode(controlNodeInstance.getControlNode_id()).isEmpty()) {
        ((de.uni_potsdam.hpi.bpt.bp2014.jcore.ActivityInstance) (controlNodeInstance)).setCanTerminate(true);
    }
}