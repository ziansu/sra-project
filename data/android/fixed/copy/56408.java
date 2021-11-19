public es.supermarket.comparator.api.Supermarket createSupermarket(final java.lang.String name) throws java.lang.IllegalArgumentException, java.lang.NullPointerException {
    final long currentId = this.idGenerator;
    ++(this.idGenerator);
    return new es.supermarket.comparator.impl.SupermarketImpl(currentId, name);
}