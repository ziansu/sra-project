private void validateSelfLoop(java.lang.String fac, java.lang.String neighbor) throws logistics.networkservice.implementation.SelfLoopNetworkException {
    if (fac.equals(neighbor)) {
        throw new logistics.networkservice.implementation.SelfLoopNetworkException("Facility cannot be neighbors to itself");
    }
}