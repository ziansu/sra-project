public es.supermarket.comparator.api.Supermarket createSupermarket(java.lang.String name) throws java.lang.IllegalArgumentException, java.lang.NullPointerException {
    long currentId = idGenerator;
    ++(idGenerator);
    return new es.supermarket.comparator.impl.SupermarketImpl(currentId, name);
}