private static boolean isOpen(br.eti.kinoshita.circuit_breaker.AbstractCircuitBreaker.State state) {
    return state == (br.eti.kinoshita.circuit_breaker.AbstractCircuitBreaker.State.OPEN);
}