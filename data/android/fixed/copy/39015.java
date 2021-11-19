public be.raildelays.domain.entities.LineStop build(final boolean validate) {
    be.raildelays.domain.entities.LineStop result = doBuild();
    if (validate) {
        validate(result);
    }
    return result;
}