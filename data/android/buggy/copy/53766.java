private boolean inExecutingList(long cid) throws java.io.IOException {
    java.util.Set<java.lang.Long> cmdsExecuting = cmdsInState.get(CommandState.EXECUTING.getValue());
    return cmdsExecuting.contains(cid);
}