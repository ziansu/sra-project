@java.lang.Override
public com.jforex.programming.position.PositionState fireEventMergeOK(final com.jforex.programming.position.IPositionFSMContext context, final com.dukascopy.api.IOrder order) {
    context.fsmEventMergeOK(order);
    return com.jforex.programming.position.PositionState.OPENED;
}