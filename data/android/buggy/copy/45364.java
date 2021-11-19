private static com.ensoftcorp.atlas.core.query.Q getFunctionsContainingEvents(com.ensoftcorp.atlas.core.query.Q events) {
    events = events.nodes(XCSG.ControlFlow_Node);
    return com.ensoftcorp.open.commons.analysis.StandardQueries.getContainingFunctions(events);
}