@java.lang.Override
public void timeRegulationEnabled(hla.rti1516e.LogicalTime time) throws hla.rti1516e.exceptions.FederateInternalError {
    initClock(((com.wesimulated.simulation.hla.DateLogicalTime) (time)));
    java.lang.System.out.println("timeRegulationEnabled");
}