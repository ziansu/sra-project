@java.lang.Override
public boolean incrementAndCheckState(java.lang.Integer increment) throws br.eti.kinoshita.circuit_breaker.CircuitBreakingException {
    return performStateCheck(1);
}