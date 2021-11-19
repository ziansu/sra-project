private void checkState(dustinl.proxy.handler.HttpExecutionHandler.State state) {
    if (!(currentState.equals(state))) {
        currentState = dustinl.proxy.handler.HttpExecutionHandler.State.WAITING_REQUEST;
        throw new java.lang.IllegalArgumentException("illegal state");
    }
}